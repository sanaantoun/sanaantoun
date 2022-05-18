window.onload=function(){
    const quantitybutton = document.querySelector('.quantitybutton');
const add1 = document.querySelector('#add1'), minus1 = document.querySelector('#substract1');
const add2 = document.querySelector('#add2'), minus2 = document.querySelector('#substract2'); 
const add3 = document.querySelector('#add3'), minus3 = document.querySelector('#substract3'); 
const add4 = document.querySelector('#add4'), minus4 = document.querySelector('#substract4'); 
    counter1 = document.querySelector('#counter1');
    counter2 = document.querySelector('#counter2');
    counter3 = document.querySelector('#counter3');
    counter4 = document.querySelector('#counter4');

    price1 = parseFloat(document.querySelector('#price1').innerText);
    price2 = parseFloat(document.querySelector('#price2').innerText);
    price3 = parseFloat(document.querySelector('#price3').innerText);
    price4 = parseFloat(document.querySelector('#price4').innerText);

    let nbItems = document.querySelector('#nbItems');
let subTotal = document.querySelector('#subtotal');
let gst = document.querySelector('#GST');
let qst = document.querySelector('#QST');
let total = document.querySelector('#total');

function updatePrice(){
    subTotal.innerText = ((quantity1*price1)+(quantity2*price2)+(quantity3*price3)+(quantity4*price4)).toFixed(2);
    nbItems.innerText = quantity1+quantity2+quantity3+quantity4;
    qst.innerText = (0.09975*subTotal.innerText).toFixed(2);
    gst.innerText = (0.05*subTotal.innerText).toFixed(2);
    total.innerText = (parseFloat(subTotal.innerText) + parseFloat(gst.innerText) + parseFloat(qst.innerText)).toFixed(2);
}

let quantity1 = 1;
let quantity2 = 1;
let quantity3 = 1;
let quantity4 = 1;

add1.addEventListener("click",()=>{
    quantity1++;
    counter1.innerText = quantity1;
    updatePrice();
})
minus1.addEventListener("click",()=>{
    if (quantity1 > 1)
    {
        quantity1--;
        counter1.innerText = quantity1;
    }
    updatePrice();
})

add2.addEventListener("click",()=>{
    quantity2++;
    counter2.innerText = quantity2;
    updatePrice();
})
minus2.addEventListener("click",()=>{
    if (quantity2 > 1)
    {
        quantity2--;
        counter2.innerText = quantity2;
    }
    updatePrice();
})

add3.addEventListener("click",()=>{
    quantity3++;
    counter3.innerText = quantity3;
    updatePrice();
})
minus3.addEventListener("click",()=>{
    if (quantity3 > 1)
    {
        quantity3--;
        counter3.innerText = quantity3;
    }
    updatePrice();
})

add4.addEventListener("click",()=>{
    quantity4++;
    counter4.innerText = quantity4;
    updatePrice();
})
minus4.addEventListener("click",()=>{
    if (quantity4 > 1)
    {
        quantity4--;
        counter4.innerText = quantity4;
    }
    updatePrice();
})


  }
