
/****************饼图封装方法********************/
function createPie(data) {
    // 为了复用性，在外面初始化
    var myChart = echarts.init(document.getElementById(data[0]));
    var option = {
        title: {
            text: data[1],
            subtext: '',
            x: 'center',
        },
        tooltip: {
            trigger: 'item',
            formatter: "{a} <br/>{b}:{c} ({d}%)"
        },
        legend: {
            orient: 'horizontal',
            data: data[2],
            top: 50
        },
        toolbox: {
            show: false,
            feature: {
                mark: false,
                dataView: {
                    show: true,
                    readOnly: false
                },
                magicType: {
                    show: true,
                    type: ['line', 'bar', 'pie', 'gauge']
                },
                restore: true
            }
        },
        calculable: true,

        //   formatter: '{b}:{c}人 ({d}%)'
        series: [{
            name: data[3],
            type: "pie",
            radius: '50%',
            center: ['50%', '50%'],
            data: data[4],
            itemStyle: {
                normal: {
                    label: {
                        show: true,
                        formatter: '{c}次'
                    }
                },
                labelLine: {
                    label: {
                        show: true
                    }
                },
                emphasis: {
                    shadowBlur: 50,
                    shadowOffsetX: 0,
                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
            }
        }]
    };
    return option;
}

 /**************************折线图*******************/
function createLine(data) {
    option = {
        title: {
            text: data[1],
            left: 'center'
        },
        tooltip: {
            trigger: 'axis'
        },
        legend: {
         //    data: data[2]
        },
        grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        toolbox: {

        },
        xAxis: {
            type: 'category',
            boundaryGap: false,
            axisLabel: { //坐标轴刻度标签的相关设置。
                interval: 0,
                rotate: "45"
            },
            data: data[2]
        },
        yAxis: {
            type: 'value'
        },
        series: [{
            name:'每月考勤情况',
            type: 'line',
            data: data[3]
        }]
    };

    /**
     * 使用方式一（动态）： 处理  axisLabel换行
     * 代码段在var option={};之后，在myChart.setOption(option);之前
     */
    option.xAxis.axisLabel = {
        interval: 0, //标签设置为全部显示
        formatter: function (params) {
            //粘贴以下function内未注释的代码
            var newParamsName = ""; // 最终拼接成的字符串
            var paramsNameNumber = params.length; // 实际标签的个数
            var provideNumber = 5; // 每行能显示的字的个数
            var rowNumber = Math.ceil(paramsNameNumber / provideNumber); // 换行的话，需要显示几行，向上取整
            // 条件等同于rowNumber>1
            if (paramsNameNumber > provideNumber) {

                for (var p = 0; p < rowNumber; p++) {
                    var tempStr = ""; // 表示每一次截取的字符串
                    var start = p * provideNumber; // 开始截取的位置
                    var end = start + provideNumber; // 结束截取的位置
                    // 此处特殊处理最后一行的索引值
                    if (p == rowNumber - 1) {
                        // 最后一次不换行
                        tempStr = params.substring(start, paramsNameNumber);
                    } else {
                        // 每一次拼接字符串并换行
                        tempStr = params.substring(start, end) + "\n";
                    }
                    newParamsName += tempStr; // 最终拼成的字符串
                }

            } else {
                // 将旧标签的值赋给新标签
                newParamsName = params;
            }
            //将最终的字符串返回
            return newParamsName
        }
    }
    return option;
}

 /***********************柱状图*************************/
function createBar(data) {
   // 指定图表的配置项和数据
   option = {
       title: {
           text: data[1],
           left: "center"
       },
       tooltip: {
           trigger: 'axis',
           axisPointer: {
               crossStyle: {
                   color: '#999'
               }
           }
       },
       // 设置x轴滚动条
       dataZoom: [{
           type: 'slider',
           show: true,
           xAxisIndex: [0],
           left: '9%',
           bottom: -5,
           start: 10,
           end: 90 //初始化滚动条
       }],
       toolbox: {

       },
       xAxis: [{
           type: 'category',
           data: data[2],
           axisPointer: {
               type: 'shadow'
           }
       }],
       yAxis: [{
           type: 'value',
           name: '人数',
           min: 0,
           interval: 5000,

       }],
       series: [{
               name: '常住人口数',
               type: 'bar',
               data: data[3]
           },
           {
               name: '心血管档案管理数',
               type: 'bar',
               data: data[4]
           }
       ]
   };
   return option;
}

function optionType(data, type) {
    if (type == 1) {
        return createPie(data);
    } else if (type == 2) {
        return createLine(data);
    } else {
        return createBar(data);
    }
}

function updateGraphData(data, graph) {
    if (graph == 1) {
        myChartPie.setOption(optionType(data, graph));
    } else if (graph == 2) {
        myChartLine.setOption(optionType(data, graph));
    }else{
        myChartBar.setOption(optionType(data, graph));
    }
}
