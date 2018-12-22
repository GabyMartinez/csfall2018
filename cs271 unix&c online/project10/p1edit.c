#include <stdio.h> 



int main(){ 
    
 
   
	char inputs[1000]; 
    
    
	char x,lastchar; 
    
    
	int b=0,i=0,n; 
 
   
    
	FILE *infile; 

 

    
	infile = fopen("a.txt","r"); 
    
     
    
    

	for(i=0;b != -1;i++){ 
    
        
		b = fscanf(infile,"%c",&x); 
        
        
		inputs[i] = x; 
        
      
    
	} 
    
    
    
	for(n=0;n<i-1;n++){ 
        
        
		x = inputs[n];
        
		lastchar = inputs[i-1];
        
        
		
		if(inputs[i-1]==32)
            
			lastchar = inputs[i-3];

		if(x==32) 
        
            
			printf("%c",lastchar); 
         
       
		else 
            
			printf("%c",inputs[n]); 
    
    
	} 
    
    
    
	fclose(infile); 
    
    
	return 0; 


}