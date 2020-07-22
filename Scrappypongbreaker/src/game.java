/****Variables*****/

//0:Initial Screen
//1:Game Screen
//2:Game-Over screen

int gameScreen = 0;

/****Setup****/

void setup(){
	size(500,500);
}

/****Blocks****/

void draw(){
	//displays contents of current screen
	if (gameScreen==0){
		initScreen();
	}else if (gameScreen==1){
		gameScreen();
	}else if(gameScreen==2){
		gameOverScreen();
	}
}


/****screencontent****/

void initScreen(){