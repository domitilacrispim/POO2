#include<bits/stdc++.h>


int main (){
	int a, b, vet[100],sum, min[100], mul=0, con=0, comin=0;
	char aux;
	scanf("%d", &a);
	while(a--){
	con=0;
	comin=0;
	memset(vet, 0, sizeof(vet));
	for(int j=0; j<30; j++){
		min[j]=1;	
	}
		mul=0;
		while(1){
			scanf("%d", &b);
			scanf("%c", &aux);
			if(aux=='+'){
				vet[con]+=b;
			
				if(mul==0){
					comin++;				
					min[comin]=b;
					printf("%d! %d\n", min[comin], comin);
						
				}
				if(mul==1){
					min[comin]=min[comin]*b;
					comin++;
					printf("%d! %d\n", min[comin], comin);
				}
					mul=0;
				//printf("%d!!\n", min[comin]);
							
			}
			if(aux=='*' ){
				vet[con]+=b;				
				con++;
				mul=1;		
				min[comin]=min[comin]*b;
				printf("%d! %d\n", min[comin], comin);		
			}
			if(aux=='\n'){
				if(mul==1){
					con++;
					min[comin]=min[comin]*b;
					vet[con]=b;					
					printf("%d! %d\n", min[comin], comin);							
				}
				else{
					vet[con]+=b;
					comin++;	
					min[comin]=b;	
					
					printf("%d! %d\n", min[comin], comin);
						
				}
				//printf("%d\n", min[comin]);
			
				break;
			}
				
			
		}
		mul=1;
		sum=0;
		for(int i=0; i<=con; i++){
			mul=mul*vet[i];
				
		}
		for(int i=0; i<comin; i++){
		//printf("%d\n", min[i]);
			sum=sum+min[i];
				
		}

		printf("%d %d", mul, sum);
	}
}
