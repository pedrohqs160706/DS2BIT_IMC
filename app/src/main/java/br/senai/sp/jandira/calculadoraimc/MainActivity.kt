package br.senai.sp.jandira.calculadoraimc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.calculadoraimc.ui.theme.CalculadoraImcTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculadoraImcTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    testeCollumn()
                }
            }
        }
    }
}

@Composable
fun testeCollumn(){
    Column {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .background(Color(0xffea1450))
                .fillMaxWidth()
                .height(225.dp)
        ) {
            Image(modifier = Modifier
                .height(70.dp)
                .offset(y = 25.dp),
                painter = painterResource(id = R.drawable.img),
                contentDescription = "saaa")

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = 50.dp),
                contentAlignment = Alignment.TopCenter
            ){
                Text(
                    text = "Calculadora IMC",
                    color = Color.White,
                    fontFamily = FontFamily.Monospace,
                )
            }
        }
        Column (
            modifier = Modifier
                .fillMaxHeight()
                .background(Color.White)
                .padding(45.dp)
        ){
            Column(
                modifier = Modifier
                    .offset(y = -70.dp)
                    .background(Color(0xfff7f3f2), shape = RoundedCornerShape(10.dp))
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp)
                    .height(420.dp)

            ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = 20.dp),
                contentAlignment = Alignment.TopCenter
            ) {
                Text(
                    text = "Seus dados",
                    fontSize = 20.sp,
                    color = Color(0xffea1450),
                    modifier = Modifier
                )
            }
                Spacer(modifier = Modifier.height(50.dp))
                Column {
                    Text(text = "Seu peso:",
                        color = Color(0xffea1450)
                    )
                    OutlinedTextField(value = "", onValueChange = {})
                }
                Spacer(modifier = Modifier.height(30.dp))
                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding()
                ){

                    Text(text = "Sua altura:",
                    color = Color(0xffea1450))
                    OutlinedTextField(value = "", onValueChange = {})

                }

                Spacer(modifier = Modifier.height(40.dp))

                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0xffea1450)),
                    shape = RoundedCornerShape(10.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)

                )
                {
                    Text(text = "CALCULAR",
                    )

                }
            }
            //Spacer(modifier = Modifier.height(0.dp))
            Column (

                modifier = Modifier
                    .width(4500.dp)
                    .height(130.dp)
                    .offset(y = -40.dp, x = 0.dp)
                    .background(Color(0xff2d9560), shape = RoundedCornerShape(10.dp))


            ){
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .offset(y = 30.dp, x = -60.dp),
                    contentAlignment = Alignment.TopCenter
                ){
                Text(text = "Resultado",
                    color = Color.White

                )}

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .offset(y = 35.dp, x = -60.dp),
                    contentAlignment = Alignment.TopCenter
                ){
                Text(text = "Peso Ideal",
                    color = Color.White
                )}

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .offset(x = 60.dp, y = 15.dp),
                    contentAlignment = Alignment.TopCenter
                ) {
                    Text(
                        modifier = Modifier
                            .fillMaxHeight()
                            .height(50.dp),
                        text = "21.3",
                        color = Color.White
                    )
                }

            }
    }


    }


}

@Preview(showBackground = true)
@Composable
fun testeCollumnPreview() {
    CalculadoraImcTheme{
        testeCollumn()
    }
}