const readMoreBtn = document.querySelector('.moredescbutton');
const text = document.querySelector('.moredesctext');

readMoreBtn.addEventListener('click', (e)=>{
    text.classList.toggle('show-more');
})