'use strict'
var common = common || {}
common = (()=>{
	const init = ctx => {
		
		localStorage.setItem('ctx', ctx)
		$('#manager_register').click(e => { location.href = `${ctx}/admin/mgr/register`})
		$('#teacher_register').click(e => { location.href = `${ctx}/admin/tea/register`})
		$('#sign-up').click(e=>{location.href=`${ctx}/move/register`})
        $('#sign-in').click(e=>{location.href=`${ctx}/move/login`})
		$(`#linkedin`).click(e => {location.href = `${ctx}/`})
		$('#blog-default').click(e=>{location.href=`${ctx}/content/bbs`})
		
		$(`#icon1`).html(`<img src="https://i1.wp.com/www.alphr.com/wp-content/uploads/2020/05/Zoom-How-to-Set-Profile-Picture.jpg?fit=577%2C320&ssl=1 alt="">`)
		$(`#icon2`).html(`<img src="https://images.unsplash.com/photo-1534308143481-c55f00be8bd7?ixid=MXwxMjA3fDB8MHxzZWFyY2h8Mjl8fHByb2ZpbGV8ZW58MHx8MHw%3D&ixlib=rb-1.2.1&w=1000&q=80 alt="">`)
		$(`#icon3`).html(`<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTQEZrATmgHOi5ls0YCCQBTkocia_atSw0X-Q&usqp=CAU alt="">`)
		$(`#title`).text(`원어민 어학 사이트`)
		$(`#message`).text(`화상강의솔루션, 스카이프 등을 이용하여 필리핀등 원어민 강사와 \n
							한국 학생간에 회화 교육을 하는 사이트 구축.`)		
		$('#facebook').click(e => {location.href = '/transfer/sym/tea/index'})
		$(`#bbs`).html(`<a href="#">게시판<i class="fa fa-angle-down"></i></a>
						<ul id="bbs-ul" role="menu" class="sub-menu"></ul>`)
		let bbs_arr = [{id:'write', val: '글쓰기'}, {id:'search', val: '조회'},{id:'c', val: 'c'}]
		$.each(bbs_arr, (i, j) => {
			$(`<li/>`)
			.attr({id: `${j.id}`})
			.text(`${j.val}`)
			.appendTo(`#bbs-ul`)
			.click(e => {
				alert(`${j.id}`)
			})
		})
		$(`#manager`).html(`<a href="#">관리자<i class="fa fa-angle-down"></i></a>
						<ul id="mgr-ul" role="menu" class="sub-menu"></ul>`)
			let mgr_arr = [{id:'sigin-up', val: '관리자 등록', url:`${ctx}/admin/mgr/register`}, {id:'sigin-in', val: '관리자 접속', url:`${ctx}/admin/mgr/access`},{id:'c', val: 'c'}]
			$.each(mgr_arr, (i, j) => {
			$(`<li/>`)
			.attr({id: `${j.id}`})
			.text(`${j.val}`)
			.appendTo(`#mgr-ul`)
			.click(e => {
				location.href = j.url
			})
		})
		$(`#teacher`).html(`<a href="#">교강사 등록<i class="fa fa-angle-down"></i></a>
						<ul id="tea-ul" role="menu" class="sub-menu"></ul>`)
			let tea_arr = [{id:'sigin-up', val: '교강사 등록',url:`${ctx}/admin/tea/register`}, {id:'sigin-in', val: '교강사 접속', url:`${ctx}/admin/tea/access`},{id:'c', val: 'c'}]
			$.each(tea_arr, (i, j) => {
			$(`<li/>`)
			.attr({id: `${j.id}`})
			.text(`${j.val}`)
			.appendTo(`#tea-ul`)
			.click(e => {
				location.href = j.url
			})
		})
	}
	const goHome = () => {
		$(`#goHome`).click(e=>{location.href = `${localStorage.getItem('ctx')}/`})
		
	}
	return {init, goHome}
})()