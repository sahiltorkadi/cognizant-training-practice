import { Calculator } from "./calculator"

describe("Testing function calc1 of Calculator", ()=>{

    beforeAll(()=>{
    }) 

    beforeEach(()=>{
    })

    
    
    afterAll(()=>{
    })
    
    afterEach(()=>{
    })

    it('Testing calc1 for negative values', ()=>{    
        let calc = new Calculator();
        let response = calc.calc1(-5);
        expect(response).toBe(0);
    })

    it('Testing calc1 for positive values', ()=>{
        let calc = new Calculator();
        let response = calc.calc1(5);
        expect(response).toBe(6);
    })
    
    it('Testing calc1 for log 10 values',()=>{
        let calc =new Calculator();
        let response = calc.calc1(4);
        expect(response).toBe(5);

    })

})