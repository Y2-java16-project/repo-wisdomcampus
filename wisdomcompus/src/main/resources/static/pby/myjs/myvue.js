
new Vue({
	el:"#person",
	data:{
		message:"我爱你"
	},
	methods:{
		wan:function(){
			console.info(123456)
			alert(this.message);
		}
	}
})
