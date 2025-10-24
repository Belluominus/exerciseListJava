import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import java.util.Vector;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import main.model.entities.Access;
import main.model.entities.Account;
import main.model.entities.BankAccount;
import main.model.entities.CarRental;
import main.model.entities.Circle;
import main.model.entities.Client;
import main.model.entities.Comment;
import main.model.entities.CompanyEmployee;
import main.model.entities.Contract;
import main.model.entities.Department;
import main.model.entities.Employee;
import main.model.entities.EmployeeEx182;
import main.model.entities.EmployeeList;
import main.model.entities.HourContract;
import main.model.entities.ImportedProduct;
import main.model.entities.Installment;
import main.model.entities.LegalEntity;
import main.model.entities.Lodger;
import main.model.entities.Order;
import main.model.entities.OrderItem;
import main.model.entities.OutsourceEmployee;
import main.model.entities.PeopleHeight;
import main.model.entities.Post;
import main.model.entities.Product;
import main.model.entities.ProductFile;
import main.model.entities.Rectangle;
import main.model.entities.Reservation;
import main.model.entities.RoomForRent;
import main.model.entities.Shape;
import main.model.entities.Student;
import main.model.entities.Taxpayers;
import main.model.entities.UsedProduct;
import main.model.entities.Vehicle;
import main.model.entities.Worker;
import main.model.entities.naturalPerson;
import main.model.enums.Color;
import main.model.enums.WorkerLevel;
import main.model.exceptions.AccountException;
import main.model.exceptions.ContractException;
import main.model.exceptions.ReservationException;
import main.model.services.BrazilTaxService;
import main.model.services.ContractService;
import main.model.services.PayPalService;
import main.model.services.RentalService;
import main.util.CurrencyConverter;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Menu das lista!");
        System.out.println("lsita: 1");
        System.out.println("lista: 2");
        System.out.println("lista: 3");
        System.out.println("lista: 4");
        System.out.println("lista: 5");
        System.out.println("lista: 6");
        System.out.println("Ex: 81");
        System.out.println("Ex: 91");
        System.out.println("Ex: 101");
        System.out.println("Ex: 102");
        System.out.println("Ex: 103");
        System.out.println("Ex: 104");
        System.out.println("Ex: 121");
        System.out.println("Ex: 122");
        System.out.println("Ex: 123");
        System.out.println("Ex: 131");
        System.out.println("Ex: 132");
        System.out.println("Ex: 133");
        System.out.println("Ex: 134");
        System.out.println("Ex: 135");
        System.out.println("Ex: 141");
        System.out.println("Ex: 142");
        System.out.println("Ex: 151");
        System.out.println("Ex: 152");
        System.out.println("Ex: 153");
        System.out.println("Ex: 154");
        System.out.println("Ex: 161");
        System.out.println("Ex: 162");
        System.out.println("Ex: 171");
        System.out.println("Ex: 172");
        System.out.println("Ex: 173");
        System.out.println("Ex: 173");
        System.out.println("Ex: 181");
        System.out.println("Ex: 182");

        Scanner sc = new Scanner(System.in);
        int list;

        list = sc.nextInt();
        System.out.println("");
        
        switch (list) {
            case 1:
                listOne();
                break;
            case 2:
                listTwo();
                break;
            case 3:
                listThree();
                break;
            case 4:
                listFour();
                break;
            case 5:
                listFive();
                break;
            case 6:
                listSix();
                break;
            case 81:
                exStaticMember();
                break; 
            case 91:
                ex91();
                break;  
            case 101:
                ex101();
                break;  
            case 102:
                ex102();
                break;  
            case 103:
                ex103();
                break;  
            case 104:
                ex104();
                break;  
            case 121:
                ex121();
                break;
            case 122:
                ex122();
                break;
            case 123:
                ex123();
                break; 
            case 131:
                ex131();
                break;
            case 132:
                ex132();
                break;
            case 133:
                ex133();
                break;
            case 134:
                ex134();
                break;
            case 141:
                ex141();
                break;
            case 142:
                ex142();
                break;
            case 151:
                ex151();
                break;
            case 152:
                ex152();
                break;
            case 153:
                ex153();
                break;
            case 154:
                ex154();
                break;
            case 161:
                ex161();
                break;
            case 162:
                ex162();
                break;
            case 171:
                ex171();
                break;
            case 172:
                ex172();
                break; 
            case 173:
                ex173();
                break;   
            case 181:
                ex181();
                break; 
            case 182:
                ex182();
                break;     
            default:
                System.out.println("Opcao inexistente!");
                break;
        }

        sc.close();
    }

    public static void listOne(){
        System.out.println("Menu exercicios primeira lista!");
        System.out.println("Exercicio: 1");
        System.out.println("Exercicio: 2");
        System.out.println("Exercicio: 3");
        System.out.println("Exercicio: 4");
        System.out.println("Exercicio: 5");
        System.out.println("Exercicio: 6");
        System.out.println("");

        Scanner sc = new Scanner(System.in);
        int exercise;

        exercise = sc.nextInt();
        System.out.println("");


        switch (exercise) {
            case 1:
                listOneExerciseOne();
                break;
            case 2:
                listOneExerciseTwo();
                break;
            case 3:
                listOneExerciseThree();
                break;
            case 4:
                listOneExerciseFour();
                break;
            case 5:
                listOneExerciseFive();
                break;
            case 6:
                listOneExerciseSix();
                break;
            default:
                System.out.println("Opcao inexistente!");
                break;
        }

        sc.close();
    }
    
    public static void listOneExerciseOne() {
        int x,y,soma;
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o numero 1:");
        x= sc.nextInt();
        System.out.println("Entre com o numero 2:");
        y= sc.nextInt();

        soma = x+y;

        System.out.println("SOMA= "+soma);

        sc.close();
    }

    public static void listOneExerciseTwo() {
        double raio, area, pi = 3.14159;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o raio do circulo:");
        raio= sc.nextDouble();

        area = pi * Math.pow(raio, 2);

        NumberFormat formatter = new DecimalFormat("#0.0000");
        
        System.out.println("A= "+formatter.format(area));

        sc.close();
    }
    
    public static void listOneExerciseThree() {
        int a,b,c,d,produto;
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o numero a:");
        a= sc.nextInt();
        System.out.println("Entre com o numero b:");
        b= sc.nextInt();
        System.out.println("Entre com o numero c:");
        c= sc.nextInt();
        System.out.println("Entre com o numero d:");
        d= sc.nextInt();

        produto= (a*b)-(c*d);
        
        System.out.println("PRODUTO= "+produto);

        sc.close();
    }

    public static void listOneExerciseFour() {
        int id;
        double horas,valorHora,salario;
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o ID:");
        id= sc.nextInt();
        
        System.out.println("Entre com o numero de horas:");
        horas= sc.nextDouble();
        
        System.out.println("Entre com o valor da hora:");
        valorHora= sc.nextDouble();

        salario = horas * valorHora;

        NumberFormat formatter = new DecimalFormat("#0.00");
        
        System.out.println("NUMBER= "+id);
        System.out.println("SALARY = U$"+formatter.format(salario));

        sc.close();
    }

    public static void listOneExerciseFive() {
        int quantProd;
        double total = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o numero de produtos diferentes a serem comprados:");
        quantProd= sc.nextInt();

        
        double[][] vendas = new double[quantProd][3];

        for(int i = 0;i < quantProd; i++){
            int seq = i+1;
            System.out.println("codigo da peça " + seq + ":");
            vendas[i][0]= sc.nextDouble();
            System.out.println("número de peças " + seq + ":");
            vendas[i][1]= sc.nextDouble();
            System.out.println("valor unitário de cada peça " + seq + ":");
            vendas[i][2]= sc.nextDouble();
        }
        
        for(int i = 0;i < quantProd; i++){
            total= total + (vendas[i][1] * vendas[i][2]);
        }

        NumberFormat formatter = new DecimalFormat("#0.00");
        
        System.out.println("VALOR A PAGAR: R$"+formatter.format(total));

        sc.close();
    }

    public static void listOneExerciseSix() {
        double a,b,c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o numero a:");
        a= sc.nextDouble();
        System.out.println("Entre com o numero b:");
        b= sc.nextDouble();
        System.out.println("Entre com o numero c:");
        c= sc.nextDouble();

        
        NumberFormat formatter = new DecimalFormat("#0.000");
        
        System.out.println("TRIANGULO: " + formatter.format(a*c/2));
        
        System.out.println("CIRCULO: " + formatter.format(3.14159 * Math.pow(c, 2)));
        
        System.out.println("TRAPEZIO: " + formatter.format((a+b)*c/2));

        System.out.println("QUADRADO: " + formatter.format(Math.pow(b, 2)));

        System.out.println("RETANGULO: " + formatter.format(a*b));

        sc.close();
    }

    public static void listTwo(){
        System.out.println("Menu exercicios segunda lista!");
        System.out.println("Exercicio: 1");
        System.out.println("Exercicio: 2");
        System.out.println("Exercicio: 3");
        System.out.println("Exercicio: 4");
        System.out.println("Exercicio: 5");
        System.out.println("Exercicio: 6");
        System.out.println("Exercicio: 7");
        System.out.println("Exercicio: 8");
        System.out.println("");

        Scanner sc = new Scanner(System.in);
        int exercise;

        exercise = sc.nextInt();
        System.out.println("");
        switch (exercise) {
            case 1:
                listTwoExerciseOne();
                break;
            case 2:
                listTwoExerciseTwo();
                break;
            case 3:
                listTwoExerciseThree();
                break;
            case 4:
                listTwoExerciseFour();
                break;
            case 5:
                listTwoExerciseFive();
                break;
            case 6:
                listTwoExerciseSix();
                break;
            case 7:
                listTwoExerciseSeven();
                break;
            case 8:
                listTwoExerciseEight();
                break;
            default:
                System.out.println("Opcao inexistente!");
                break;
        }

        sc.close();
    }

    public static void listTwoExerciseOne(){
        int numero;
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Entre com o numero a ser validado:");
        numero= sc.nextInt();

        if(numero < 0){
           System.out.println("NEGATIVO");
        } else {
           System.out.println("NAO NEGATIVO");
        }

        sc.close();
    }

    public static void listTwoExerciseTwo(){
        int numero;
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Entre com o numero a ser validado:");
        numero= sc.nextInt();

        if((numero % 2) == 0){
           System.out.println("PAR");
        } else {
           System.out.println("IMPAR");
        }

        sc.close();
    }

    public static void listTwoExerciseThree(){
        int x,y;
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Entre com o primeiro numero:");
        x= sc.nextInt();
        System.out.println("Entre com o segundo numero:");
        y= sc.nextInt();

        if((x % y) == 0 || (y % x) == 0 ){
           System.out.println("Sao Multiplos");
        } else {
           System.out.println("Nao sao Multiplos");
        }

        sc.close();
    }

    public static void listTwoExerciseFour(){
        int inicio,fim,horas;
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Entre com a primeira hora:");
        inicio= sc.nextInt();
        System.out.println("Entre com a segunda hora:");
        fim= sc.nextInt();


        if(inicio == fim && inicio != 0){
            System.out.println("jogos devem durar ao menos 1h");
        } if (inicio < fim) {
            horas = -1 * (inicio - fim);
            
            System.out.println("O JOGO DUROU " + horas + " HORA(S)");
        }else {
            horas = -1 * (inicio - 24) + fim;

            System.out.println("O JOGO DUROU " + horas + " HORA(S)");
        }

        sc.close();
    }

    public static void listTwoExerciseFive(){
        double[][] produtos = {
                {1, 4.00},
                {2, 4.50},
                {3, 5.00},
                {4, 2.00},
                {5, 1.50}
            };

        double total;
        int produto,quantidade,index = 0;
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Entre com o codigo do produto:");
        produto= sc.nextInt();
        System.out.println("Entre com a quantidade de produtos:");
        quantidade= sc.nextInt();

        for(int i = 0; i < 5; i++){
            if (produtos[i][0] == produto ){
                index = i;
                i= 5;
            }if (i == 4){
                System.out.println("Produto inexistente");
            }
        }

        total = produtos[index][1] * quantidade;
        
        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println("Total: R$ " + formatter.format(total));

        sc.close();
    }
    
    public static void listTwoExerciseSix(){
        double numero;
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Entre com o numero:");
        numero= sc.nextDouble();


        sc.close();
        if(numero >= 0 && numero <= 25){
            System.out.println("Intervalo [0,25]");
            return;
        } if (numero > 25 && numero <= 50) {
            System.out.println("Intervalo (25,50]");
            return;
        } if (numero > 50 && numero <= 75) {
            System.out.println("Intervalo (50,75]");
            return;
        } if (numero > 75 && numero <= 100) {
            System.out.println("Intervalo (75,100]");
            return;
        }else {
            System.out.println("Fora de intervalo");
            return;
        }
    }
    public static void listTwoExerciseSeven(){
        float x, y;
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Entre com o vlaor de x:");
        x= sc.nextFloat();
        System.out.println("Entre com o valor de y:");
        y= sc.nextFloat();

        sc.close();
        if(x > 0 && y > 0){
            System.out.println("Q1");
            return;
        } if (x < 0 && y > 0) {
            System.out.println("Q2");
            return;
        } if (x < 0 && y < 0) {
            System.out.println("Q3");
            return;
        } if (x > 0 && y < 0) {
            System.out.println("Q4");
            return;
        } if (x == 0 && y == 0) {
            System.out.println("Origem");
            return;
        } if (x == 0) {
            System.out.println("Eixo X");
            return;
        }else {
            System.out.println("Eixo y");
            return;
        }
    }
    
    public static void listTwoExerciseEight(){
        double salario,misc,ir = 0;
        int i = 0;
        boolean fim = false;

        double tarifa[] = {0.08,0.18,0.28}; 
        double faixa[] = {1000.00, 1500.00, 0};

        Scanner sc = new Scanner(System.in);

        
        System.out.println("Entre com o salario:");
        salario= sc.nextDouble();

        sc.close();

        if (salario <= 2000){
            System.out.println("Isento");
            return;
        }

        misc = salario - 2000.00;

        do {            
            ir = ir + ((i >= 2 ? misc : misc < faixa[i] ? misc : faixa[i]) * tarifa[i]);

            misc = misc < faixa[i] ? misc : misc - faixa[i];
        
            if(i >= 2 || misc <= 0){
                fim = true;
            }
            i++;
        } while (fim == false);

        
        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println("R$ " + formatter.format(ir));
    }

    public static void listThree(){
        System.out.println("Menu exercicios terceira lista!");
        System.out.println("Exercicio: 1");
        System.out.println("Exercicio: 2");
        System.out.println("Exercicio: 3");
        System.out.println("");

        Scanner sc = new Scanner(System.in);
        int exercise;

        exercise = sc.nextInt();
        System.out.println("");


        switch (exercise) {
            case 1:
                listThreeExerciseOne();
                break;
            case 2:
                listThreeExerciseTwo();
                break;
            case 3:
                listThreeExerciseThree();
                break;
            default:
                System.out.println("Opcao inexistente!");
                break;
        }

        sc.close();
    }

    public static void listThreeExerciseOne() {
        String senhaCorreta = "2002";

        Scanner sc = new Scanner(System.in);
        String senhaEntrada = "";


        while (!senhaEntrada.equals(senhaCorreta)) {
            System.out.println("");
            System.out.println("Entre com a senha: ");
            
            senhaEntrada = sc.nextLine();
            
            if(!senhaEntrada.equals(senhaCorreta)){
                System.out.println("");
                System.out.println("Senha Invalida");      
            } else {
                System.out.println("");
                System.out.println("Acesso Permitido");
            }     
        }
        
        sc.close();

    }

    public static void listThreeExerciseTwo(){
        float x, y;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Entre com o vlaor de x:");
            x= sc.nextFloat();
            System.out.println("Entre com o valor de y:");
            y= sc.nextFloat();


            if(x > 0 && y > 0){
                System.out.println("primeiro");
            } if (x < 0 && y > 0) {
                System.out.println("segundo");
            } if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } if (x > 0 && y < 0) {
                System.out.println("quarto");
            }
        } while (x != 0 && y != 0);

        sc.close();
    }

    public static void listThreeExerciseThree(){
        Scanner sc = new Scanner(System.in);
        int A=0,G=0,D=0,produtoPreferido = 0;

        while (produtoPreferido != 4) {
            System.out.println("");
            System.out.println("_______________________________");
            System.out.println("Entre com o produto preferido: ");
            System.out.println("1 Alcool");
            System.out.println("2 Gasolina");
            System.out.println("3 Disel");
            System.out.println("4 Fim");
            System.out.println("_______________________________");
            System.out.println("");


            produtoPreferido= sc.nextInt();

            switch (produtoPreferido) {
                case 1:
                    A++;
                    break;
                case 2:
                    G++;
                    break;
                case 3:
                    D++;
                    break;
                case 4:
                    break;
                default:
                    System.out.println("+++++++++++++++++");
                    System.out.println("Produto invalido!");
                    System.out.println("+++++++++++++++++");
                    break;
            }
        }

        System.err.println("Alcool: " +A);
        System.err.println("Gasolina: " +G);
        System.err.println("Diesel: " +D);

        sc.close();
    }

    public static void listFour(){
        System.out.println("Menu exercicios quarta lista!");
        System.out.println("Exercicio: 1");
        System.out.println("Exercicio: 2");
        System.out.println("Exercicio: 3");
        System.out.println("Exercicio: 4");
        System.out.println("Exercicio: 5");
        System.out.println("Exercicio: 6");
        System.out.println("Exercicio: 7");
        System.out.println("");

        Scanner sc = new Scanner(System.in);
        int exercise;

        exercise = sc.nextInt();
        System.out.println("");


        switch (exercise) {
            case 1:
                listFourExerciseOne();
                break;
            case 2:
                listFourExerciseTwo();
                break;
            case 3:
                listFourExerciseThree();
                break;
            case 4:
                listFourExerciseFour();
                break;
            case 5:
                listFourExerciseFive();
                break;
            case 6:
                listFourExerciseSix();
                break;
            case 7:
                listFourExerciseSeven();
                break;
            default:
                System.out.println("Opcao inexistente!");
                break;
        }

        sc.close();
    }

    public static void listFourExerciseOne(){
        Scanner sc = new Scanner(System.in);
        int X;

        do {
            System.out.println("");
            System.out.println("Entre com o valor de X: ");


            X= sc.nextInt();

            sc.close();

            if(!(X >= 0 && X <= 1000)){
                System.out.println("");
                System.out.println("++++++++++++++++++++++++++");
                System.out.println("X deve estar ente 0 e 1000");
                System.out.println("++++++++++++++++++++++++++");
                System.out.println("");
            }
            
            System.out.println("");

        } while (!(X >= 0 && X <= 1000));

        if(X==0){
            return;
        }

        for (int i = 0; i <= X; i++) {
            if(i % 2 != 0){
                System.err.println(i);
            }
        }
    }

    public static void listFourExerciseTwo(){
        int N,X,IN = 0,OUT = 0;
        System.out.println("Quantos numeros inteiros serao inseridos: ");

        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("");
            System.out.println("Entre com o " + (i+1) + "º numero inteiro: ");

            X = sc.nextInt();

            if(X >= 10 && X <= 20){
                IN ++;
            }else {
                OUT ++;
            }
        }
        
        System.out.println("");
        System.out.println(IN + " in");
        System.out.println(OUT + " out");

        sc.close();
    }

    public static void listFourExerciseThree(){
        int N;
        float X=0,helper;

        System.out.println("Quantos casos de teste serao inseridos: ");

        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            X=0;
            System.out.println("");
            System.out.println("Entre com o 1º valor (peso 2): ");
            helper= sc.nextFloat();
            X = X + (helper * 2);
            System.out.println("Entre com o 2º valor (peso 3): ");
            helper= sc.nextFloat();
            X = X + (helper * 3);
            System.out.println("Entre com o 3º valor (peso 5): ");
            helper= sc.nextFloat();
            X = X + (helper * 5);
            
            System.out.println("");
            NumberFormat formatter = new DecimalFormat("#0.0");
            System.err.println(formatter.format(X/10));
        }

        sc.close();
    }

    public static void listFourExerciseFour(){
        int N;
        float X=0,Y=0;

        System.out.println("Quantas divisoes serao feitas: ");

        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("");
            System.out.println("Entre com o numerador: ");
            X = sc.nextInt();
            System.out.println("");
            System.out.println("Entre com o denumerador: ");
            Y = sc.nextInt();



            if (Y != 0) {
                NumberFormat formatter = new DecimalFormat("#0.0");
                System.out.println("");
                System.out.println(formatter.format(X/Y));
            }else{
                System.out.println("");
                System.out.println("divisao impossivel");
            }
            
        }

        sc.close();
    }
    public static void listFourExerciseFive(){
        int N,result = 1;

        System.out.println("");
        System.out.println("Qual numero a ser calculado o fatorial: ");

        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            result = result * (N - i);
        }

        System.out.println("");
        System.out.println(result);

        sc.close();
    }

    public static void listFourExerciseSix(){
        int N;

        System.out.println("");
        System.out.println("Qual numero a ser calculado todos os seus divisores: ");

        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        System.out.println("");

        for (int i = 0; i < N; i++) {
            if(N % (i+1) == 0){
                System.out.println(i+1);
            }
        }

        sc.close();
    }

    public static void listFourExerciseSeven(){
        int N;

        System.out.println("");
        System.out.println("Qual numero de linhas: ");

        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        System.out.println("");

        NumberFormat formatter = new DecimalFormat("#0");

        for (int i = 0; i < N; i++) {
            System.out.print((i+1));
            System.out.print(" ");
            System.out.print(formatter.format(Math.pow((i+1), 2)));
            System.out.print(" ");
            System.out.print(formatter.format(Math.pow((i+1), 3)));
            System.out.println();

        }

        sc.close();
    }
    
    public static void listFive(){
        System.out.println("Menu exercicios quinta lista!");
        System.out.println("Exercicio: 1");
        System.out.println("Exercicio: 2");
        System.out.println("Exercicio: 3");
        System.out.println("");

        Scanner sc = new Scanner(System.in);
        int exercise;

        exercise = sc.nextInt();
        System.out.println("");


        switch (exercise) {
            case 1:
                listFiveExerciseOne();
                break;
            case 2:
                listFiveExerciseTwo();
                break;
            case 3:
                listFiveExerciseThree();
                break;
            default:
                System.out.println("Opcao inexistente!");
                break;
        }

        sc.close();
    }

    public static void listFiveExerciseOne(){
        double height, width;

        System.out.println("");
        System.out.println("Enter rectangle width and height: ");

        Scanner sc = new Scanner(System.in);
        
        width = sc.nextDouble();
        height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(Color.BLACK ,width , height);
        System.out.println("");


        System.out.println("AREA = " + rectangle.getArea());
        System.out.println("PERIMETER = " + rectangle.getPerimeter());
        System.out.println("DIAGONAL = " + rectangle.getDiagonal());

        sc.close();
    }
    
    public static void listFiveExerciseTwo(){
        String name;
        double tax, grossSalary, percentage;
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Gross salary: ");
        grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        tax = sc.nextDouble();

        Employee employee = new Employee(name, grossSalary, tax);
        System.out.println("");

        System.out.println("Employee: " + employee);
        System.out.println("");

        System.out.print("Witch percentage to increase salary? ");
        percentage = sc.nextDouble();
        System.out.println("");

        employee.increaseSalary(percentage);

        System.out.println("Updated data: " + employee);

        sc.close();
    }

    public static void listFiveExerciseThree(){
        String name;
        double _1stGrade, _2stGrade, _3stGrade;
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.println("Enter with the student data: ");
        System.out.print("Name : " );
        name =  sc.nextLine();
        System.out.print("1st quarter grade: ");
        _1stGrade = sc.nextDouble();
        System.out.print("2st quarter grade: ");
        _2stGrade = sc.nextDouble();
        System.out.print("3st quarter grade: ");
        _3stGrade = sc.nextDouble();

        Student student = new Student(name, _1stGrade, _2stGrade, _3stGrade);
        System.out.println("");

        System.err.println("Final Grade = " + String.format("%.2f", student.finalGrade()));
        System.err.println(student.isAproved() ? "PASS" : "FAILED");
        if (!student.isAproved()){
            System.err.println("MISSING " + String.format("%.2f", student.missingGrade()) + " POINTS");
        }

        sc.close();
    }

    public static void listSix(){
        System.out.println("Os exercicio da lista 6 foram agrupado em uma unica questao!");
        System.out.println("Todos os exercicios em um: 1");
        System.out.println("");

        Scanner sc = new Scanner(System.in);
        int exercise;

        exercise = sc.nextInt();
        System.out.println("");


        switch (exercise) {
            case 1:
                listSixExerciseOne();
                break;
            default:
                System.out.println("Opcao inexistente!");
                break;
        }

        sc.close();
    }

    public static void listSixExerciseOne() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas? ");
        int aux = sc.nextInt();

        PeopleHeight[] peopleHeightVec = new PeopleHeight[aux];
        
        for (int i = 0; i < peopleHeightVec.length; i++) {
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Genero (M/F): ");
            char gender = sc.next().charAt(0);
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();

            peopleHeightVec[i] = new PeopleHeight(name, gender, age, height);
        }
        int fCount = 0;
        int mCount = 0;

        int generalCount = 0;
        String older = "";
        int olderCount = 0;
        double lessHeight = 0.0;
        double moreHeight = 0.0;
        double fHeight = 0.0;
        double mHeight = 0.0;
        double generalHeight = 0.0;
        double minorsCount = 0; 
        Vector<String> minors = new Vector<>();

        for (int i = 0; i < peopleHeightVec.length; i++) {
            if (lessHeight == 0.0 || lessHeight > peopleHeightVec[i].getHeight()){
                lessHeight = peopleHeightVec[i].getHeight();
            }
            if (moreHeight < peopleHeightVec[i].getHeight()){
                moreHeight = peopleHeightVec[i].getHeight();
            }

            if(olderCount < peopleHeightVec[i].getAge()){
                older = peopleHeightVec[i].getName();
            }

            if(peopleHeightVec[i].getGender() == 'F') {
                fCount += 1;
                fHeight += peopleHeightVec[i].getHeight();
            }else if(peopleHeightVec[i].getGender() == 'M') {
                mCount += 1;
                mHeight += peopleHeightVec[i].getHeight();
            }

            generalCount += 1;
            generalHeight += peopleHeightVec[i].getHeight();

            if (peopleHeightVec[i].getAge() < 16 ){
                minorsCount += 1;
                minors.add(peopleHeightVec[i].getName());
            }
        }
        System.out.println();
        System.out.println("Menor altura = " + String.format("%.2f", lessHeight));
        System.out.println("Maior altura = " + String.format("%.2f", moreHeight));
        System.out.println();
        System.out.println("Altura média: " + String.format("%.2f", (generalHeight / generalCount)));
        System.out.println("Altura média mulheres: " + String.format("%.2f", (fHeight / fCount)));
        System.out.println("Altura média homens: " + String.format("%.2f", (mHeight / mCount)));
        System.out.println();
        System.out.println("Numero de homens = " + mCount);
        System.out.println();
        System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", (minorsCount / peopleHeightVec.length) * 100) + "%");
        for (int i = 0; i < minorsCount; i++) {
            System.out.println(minors.get(i));
        }
        System.out.println();
        System.out.println("PESSOA MAIS VELHA: "  + older);


        sc.close();
    }
    public static void listSixExerciseTwo() {
        
    }

    public static void exStaticMember() {

        System.out.println("What is the dollar price? " + String.format("%.2f", CurrencyConverter.dollarPrice));

        Scanner sc = new Scanner(System.in);
        System.out.print("How many dollars will be bought? ");
        double X = sc.nextDouble();

        System.out.println("Amount to be paid in reais = " + String.format("%.2f", CurrencyConverter.paidAmount(X)));

        sc.close();
    }

    public static void ex91() {
        Scanner sc = new Scanner(System.in);
        double aux;
        BankAccount bankAccount;

        System.out.print("Enter account number: ");
        int accNumber = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String accHolder = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char opt = sc.next().charAt(0);

        if(opt == 'y'){
            System.out.print("Enter initial depoiste value: ");
            aux = sc.nextDouble();

            bankAccount = new BankAccount(accNumber, accHolder, aux);
        } else {
            bankAccount = new BankAccount(accNumber, accHolder);
        }
        System.out.println("");

        System.out.println("Account Data: ");
        System.out.println(bankAccount.toString());
        System.out.println("");

        
        System.out.print("Enter a depoiste value: ");
        aux = sc.nextDouble();
        bankAccount.deposit(aux);
        System.out.println("Updated Account Data: ");
        System.out.println(bankAccount.toString());
        System.out.println("");

        
        System.out.print("Enter a withdraw value: ");
        aux = sc.nextDouble();
        bankAccount.withdraw(aux);
        System.out.println("Updated Account Data: ");
        System.out.println(bankAccount.toString());

        sc.close();
    }

    public static void ex101() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i=0; i<vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i=0; i<vect.length; i++) {
            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;

        System.out.println("AVERAGE PRICE = "+ String.format("%.2f", avg));

        sc.close();
    }

    public static void ex102() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        RoomForRent[] rooms = new RoomForRent[10];

        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new RoomForRent(i);
        }

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        Lodger[] lodger = new Lodger[n];

        for (int i=0; i<lodger.length; i++) {
            System.out.println();
            System.out.println("Rent #"+ i +": ");
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room (0 to 9): ");
            int room = sc.nextInt();


            if(!rooms[room].getIsVacant()){
                boolean aux = false;
                do {
                    System.out.print("Room in occupied select a new one: ");
                    room = sc.nextInt();

                    if(rooms[room].getIsVacant()){
                        aux = true;
                    }
                    
                } while (!aux);
            }
            
            lodger[i] = new Lodger(name, email, room);
            rooms[room].rentRoom(lodger[i]);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (RoomForRent room : rooms) {
            if(!room.getIsVacant()){
                System.out.println(room.getRoom() + ": " + room.toString());
            }
        }

        sc.close();
    }

    public static void ex103() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<EmployeeList> employeeList = new ArrayList<>();

        System.out.print("How many employees will be registred? ");
        int n = sc.nextInt();

        for (int i=0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #"+ i +": ");
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employeeList.add(new EmployeeList(name, salary));
        }

        System.err.println();
        for (EmployeeList emp : employeeList) {
            System.out.println(emp);
        }
        System.err.println();

        System.err.println("Enter the employee id that will have salary increase : ");
        sc.nextLine();
        String uuidString = sc.nextLine();
        UUID uuid = UUID.fromString(uuidString);
        System.err.println("Enter the percentage: ");
        double percentage = sc.nextDouble();

        EmployeeList employee = employeeList.stream().filter(emp -> emp.getId().equals(uuid)).findFirst().orElse(null);

        employee.salaryIncreaseByPercentage(percentage);

        System.err.println();

        for (EmployeeList emp : employeeList) {
            System.out.println(emp);
        }

        sc.close();
    }

    public static void ex104(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] mat = new int[n][m];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int X = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(X == mat[i][j]){
                    System.err.println("position " + i + "," + j);
                    if(j > 0){
                        System.out.println("left: " + mat[i][j - 1]);
                    }
                    if(i > 0){
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if(j < mat[i].length - 1){
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if(i < mat.length - 1 ){
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                }
            }
        }

        sc.close();
    };

    private static void ex121(){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter with the department`s name: ");
        String departmentName = sc.nextLine();

        System.err.println("Enter with the worker data: ");
        System.err.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double workerSalary = sc.nextDouble();

        Worker worker = new Worker(
            workerName, 
            WorkerLevel.valueOf(workerLevel), 
            workerSalary, 
            new Department(departmentName)
        ); 

        System.out.print("How many contracts to this worker? ");
        int contractsCount = sc.nextInt();

        for (int i = 0; i < contractsCount; i++) {
            System.out.println("Enter contract #"+ (i+1)  + " data");
            System.out.print("Date (DD/MM/YYYY): ");
            sc.nextLine();
            String stringDate = sc.nextLine();
            LocalDate contractDate = LocalDate.parse(stringDate, formatter);
            System.out.print("Value per hour: ");
            double contractValuePerHour = sc.nextDouble();
            System.out.print("Value per hour: ");
            int contractHours = sc.nextInt();

            worker.addContract(new HourContract(
                contractDate, 
                contractValuePerHour, 
                contractHours)
            );
        }

        System.err.println("");
        System.err.print("Enter month and year to calculate income (MM/YYYY): ");
        sc.nextLine();
        String yearMonth = sc.nextLine();

        int month = Integer.parseInt(yearMonth.substring(0, 2));
        int year = Integer.parseInt(yearMonth.substring(3));
        System.err.println("Name: " + worker.getName());
        System.err.println("Department: " + worker.getDepartment().getName());
        System.err.println("Income for "+yearMonth+" : " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    };

    private static void ex122(){
        List<Post> posts = new ArrayList<>();

        posts.add(new Post(ZoneId.of("America/Sao_Paulo"), "Traveling to New Zealand", "I`m going to visit this wondeful country!"));
        posts.add(new Post(ZoneId.of("Asia/Tokyo"), "Good night guys", "See you tomorrow"));

        for (Post post : posts) {
            if(post.getTitle().equals("Traveling to New Zealand")){
                post.setLikes(12);

                post.addComment(new Comment("Have a nice trip"));
                post.addComment(new Comment("Wow that's awesome!"));
            } 
            if(post.getTitle().equals("Good night guys")){
                post.setLikes(5);

                post.addComment(new Comment("Good night"));
                post.addComment(new Comment("May the Force be with you"));
            }
        }

        for (Post post : posts) {
            System.out.println(post.toString());
            List<Comment> comments = post.getComments();
            System.out.println();
            for (Comment comment : comments) {
                System.out.println(comment.toString());
            }
            System.out.println("___________________________________");
        } 
    }

    private static void ex123(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> productList = new ArrayList<>();

        productList.add(new Product("TV", 1000.00));
        productList.add(new Product("Mouse", 40.00));
        productList.add(new Product("HeadSet", 200.00));

        System.out.println("Enter with the client data");
        System.err.print("Name: ");
        String clientName = sc.nextLine();
        System.err.print("Email: ");
        String clientEmail = sc.nextLine();
        System.err.print("Birth date (DD/MM/YYYY): ");
        String clientBirthDate = sc.nextLine();

        Client client = new Client(clientName, clientEmail, clientBirthDate);

        Order order = new Order(client);

        System.out.println();
        System.out.println("Product list (Enter with te exact name).");

        for (Product product : productList) {
            System.out.println(product.toString());
        }
        System.out.println();

        
        System.out.print("How many items to this order? ");
        int itemsCount = sc.nextInt();

        for (int i = 0; i < itemsCount; i++) {
            System.out.println();
            System.out.println("Enter #" +(i + 1)+ " item data: ");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Quantity: ");
            int productQuant = sc.nextInt();

            productList.stream()
                .filter(p -> p.getName().equals(productName))
                .findFirst()
                .ifPresent(p -> 
                    order.addItem(new OrderItem(productQuant, p))
                );
        }
        
        System.out.println();
        System.out.println(order);

        sc.close();
    }

    public static void ex131() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<CompanyEmployee> employeeList = new ArrayList<>();
        System.out.println();
        System.out.print("Enter the number of employees: ");
        int count =  sc.nextInt();

        for (int i = 0; i < count; i++) {
            sc.nextLine();
            System.out.println("Employee " + (i+1) +" data:");
            System.out.print("Outsourced (y/n)? ");
            char opt = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if(opt == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();

                employeeList.add(new OutsourceEmployee(name, hours, valuePerHour ,additionalCharge));
            } else {
                employeeList.add(new CompanyEmployee(name, hours, valuePerHour));
            }

        }

        System.out.println();

        System.out.println("PAYMENTS:");
        for (CompanyEmployee employee : employeeList) {
            System.out.println(employee.getName() + " - " + employee.payment());
        }

        sc.close();
    }

    public static void ex132() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> productsList = new ArrayList<>();
        System.out.println();
        System.out.print("Enter the number of products: ");
        int count =  sc.nextInt();

        for (int i = 0; i < count; i++) {
            sc.nextLine();
            System.out.print("Common, used or imported (c/u/i)? ");
            char opt = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if(opt == 'i'){     
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();

                productsList.add(new ImportedProduct(name, price, customsFee));
            } else if(opt == 'u'){
                sc.nextLine();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String manufactureDate = sc.nextLine();

                productsList.add(new UsedProduct(name, price, manufactureDate));
            } else {
                productsList.add(new Product(name, price));
            }
        }
        System.out.println();

        System.out.println("PRICE TAGS:");
        for (Product product : productsList) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }

    public static void ex133() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> shapeList = new ArrayList<>();

        System.out.println();
        System.out.print("Enter the number of shapes: ");
        int count =  sc.nextInt();

        for (int i = 0; i < count; i++) {
            sc.nextLine();
            System.out.print("Common, used or imported (r/c)? ");
            char opt = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.nextLine());           

            if (opt == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();

                shapeList.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Raidius: ");
                double radius = sc.nextDouble();

                shapeList.add(new Circle(color, radius));
            }            
        }
        System.out.println();

        System.out.println("SHAPE AREAS:");
        for (Shape shape : shapeList) {
            System.out.println(String.format("%.2f", shape.area()));
        }

        sc.close();
    }

    public static void ex134() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Taxpayers> taxpayersList = new ArrayList<>();
    
        System.out.println();
        System.out.print("Enter the number of tax payers: ");
        int count =  sc.nextInt();

        for (int i = 0; i < count; i++) {
            sc.nextLine();
            System.out.print("Individual or company (i/c)? ");
            char opt = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if(opt == 'i'){
                System.out.print("Health expenditures: ");
                double healthSpending = sc.nextDouble();

                taxpayersList.add(new naturalPerson(name, anualIncome, healthSpending));
            } else {
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();
                
                taxpayersList.add(new LegalEntity(name, anualIncome, employees));
            }
        }            

        System.out.println();
        System.out.println("TAXES PAID:");
        double taxTotal = 0.0;
        for (Taxpayers taxpayers : taxpayersList) {
            System.out.println(taxpayers.getName() + ": $ " + String.format("%.2f", taxpayers.getTax()));
            taxTotal += taxpayers.getTax();
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", taxTotal));

        sc.close();
    }

    public static void ex141(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            System.out.print("Room number: ");
            int roomNumber = sc.nextInt();
            sc.nextLine();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            LocalDate checkIn = LocalDate.parse(sc.nextLine(), formatter);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            LocalDate checkOut = LocalDate.parse(sc.nextLine(), formatter);
    
            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
    
            System.out.println();
            System.out.println("Enter data to update the reservation:");

            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = LocalDate.parse(sc.nextLine(), formatter);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = LocalDate.parse(sc.nextLine(), formatter);

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation); 
        } catch (DateTimeParseException e) {
            System.err.println("Invalid date Format");
        } catch (ReservationException e) {
            System.err.println("Error in reservation: " + e.getMessage());
        } catch (RuntimeException e) {
            System.err.println("Unexpected error");
        }

        sc.close();
    }

    public static void ex142(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance =  sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit =  sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.println();

            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
            System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
        } catch (AccountException e) {
            System.err.println(e.getMessage());
        } catch (RuntimeException e) {
            System.err.println("Unexpected error");
        }

        sc.close();
    }

    public static void ex151() {
        String path = "src/main/in.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            
            while (line != null) {
                System.out.println(line);   
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void ex152() {
        String path = "src/main/out.txt";

        String[] lines = new String[] {"Valheim", "Risk of Rain 2", "Kingdom Come: Deliverence II"};

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void ex153() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter with path: ");
        // Recomended use "src/main"
        String stgPath = sc.nextLine();

        File path = new File(stgPath);
        System.out.println();
        System.out.println("getName: " + path.getName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getPath: " + path.getPath());

        File[] folders = path.listFiles(File :: isDirectory);

        System.out.println();
        System.out.println("FOLDERS: ");
        for (File folder : folders) {
            System.out.println(folder);
        }


        File[] files = path.listFiles(File :: isFile);

        System.out.println();
        System.out.println("FILES: ");
        for (File file : files) {
            System.out.println(file);
        }

        boolean success = new File(stgPath + "/Exemple").mkdir();

        System.out.println("Directory created successfully: " + success);

        sc.close();
    }

    public static void ex154() {
        String stgPath = "src/main/files/in.csv";
        File path = new File(stgPath);
        List<ProductFile> products = new ArrayList<>();

        Path pathToNewFile = Paths.get(path.getParent() + "/out/summary.csv");
        
       try {
            Files.createDirectories(pathToNewFile.getParent());
            if(!Files.exists(pathToNewFile)){
                Files.createFile(pathToNewFile);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
        try (
            BufferedReader br = new BufferedReader(new FileReader(path));
            BufferedWriter bw = new BufferedWriter(new FileWriter(pathToNewFile.toFile()));
            ) {
            String line = br.readLine();

            while (line != null) {
                String[] stgArray = line.split(",");
                String name = stgArray[0];
                double price = Double.parseDouble(stgArray[1]);
                int quant = Integer.parseInt(stgArray[2]);

                products.add(new ProductFile(name, price, quant));

                line = br.readLine();
            }  
                
            for (ProductFile product : products) {
                bw.write(product.getName() + "," + product.totalValue());
                bw.newLine();
            }
        
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void ex161(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm):");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), formatter);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), formatter);

        CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Entre com o preço por hora: ");
        double hourPrice = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double dayPrice = sc.nextDouble();

        RentalService rentalService = new RentalService(hourPrice, dayPrice, new BrazilTaxService());

        rentalService.processInvoice(carRental);

        System.err.println("FATURA: ");
        System.out.println("Pagamento basico: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
        System.out.println("Imposto: " + String.format("%.2f", carRental.getInvoice().getTax()));
        System.out.println("Pagamento total: " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));

        sc.close();
    }

    public static void ex162(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            System.out.println("Entre os dados do contrato:");
            System.out.print("Numero: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Data (dd/MM/yyyy): ");
            LocalDate date = LocalDate.parse(sc.nextLine(), formatter);
            System.out.print("Valor do contrato: ");
            double amount = sc.nextDouble();
    
            Contract contratc = new Contract(number, date, amount);
    
            
            System.out.print("Entre com o numero de parcelas: ");
            int mounths = sc.nextInt();
    
            ContractService contractService =  new ContractService(new PayPalService());
     
            contractService.processContract(contratc, mounths);
    
            System.err.println();
            System.err.println("Parcelas:");
            for (Installment installment : contratc.getInstallmentList()) {
                System.err.println(installment);
            }
        } catch (DateTimeParseException e) {
            System.err.println("Invalid date Format");
        } catch (ContractException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.err.println("Unexpected error");
        }

        sc.close();
    }

    public static void ex171(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // src/main/files/ex171.txt
        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Set<Access> accessSet = new HashSet<>(); 

            String line = br.readLine();
            
            while (line != null) {
                String[] stgArray = line.split(" ");
                String name = stgArray[0];
                Instant instant = Instant.parse(stgArray[1]);

                accessSet.add(new Access(name, instant));

                line = br.readLine();
            }

            System.out.println("Total users: " + accessSet.size());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    } 

    public static void ex172(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.err.print("How many students for course A? ");
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int helper = sc.nextInt();
            a.add(helper);
        }

        System.err.print("How many students for course B? ");
        count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int helper = sc.nextInt();
            b.add(helper);
        }

        System.err.print("How many students for course C? ");
        count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int helper = sc.nextInt();
            c.add(helper);
        }

        a.addAll(b);
        a.addAll(c);

        System.out.println("Total students: " + a.size());
        sc.close();
    }

    public static void ex173(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // src/main/files/ex173.csv
        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            
            Map<String, Integer> votes = new HashMap<>();

            while (line != null) {
                String[] stgArray = line.split(",");

                if(votes.containsKey(stgArray[0])){
                    votes.put(stgArray[0], (Integer.parseInt(stgArray[1]) + votes.get(stgArray[0])));
                } else {
                    votes.put(stgArray[0], Integer.parseInt(stgArray[1]));
                }

                line = br.readLine();
            }

            for (String key : votes.keySet()) {
                System.out.println(key + ": " + votes.get(key));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
    public static void ex181(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // src/main/files/ex181.csv
        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            
            List<Product> products = new ArrayList<>();

            while (line != null) {
                String[] stgArray = line.split(",");

                products.add(new Product(stgArray[0], Double.parseDouble(stgArray[1])));

                line = br.readLine();
            }

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
            
            Double avg = products.stream()
                .mapToDouble(x -> x.getPrice())
                .sum() / products.size();

            List<String> names = products.stream()
                .filter(x -> x.getPrice() < avg)
                .map(x -> x.getName())
                .sorted(comp.reversed())
                .collect(Collectors.toList());

            System.out.println("Average price: " + String.format("%.2f", avg));
            for (String name : names) {
                System.out.println(name);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


        sc.close();
    }

    public static void ex182(){
         Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // src/main/files/ex182.csv
        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            List<EmployeeEx182> employees = new ArrayList<>();

            while (line != null) {
                String[] stgArray = line.split(",");

                employees.add(new EmployeeEx182(stgArray[0], stgArray[1], Double.parseDouble(stgArray[2])));

                line = br.readLine();
            }

            
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            
            List<String> emails = employees.stream()
            .filter(e -> e.getSalary() > salary)
            .map(e -> e.getEmail())
            .sorted()
            .collect(Collectors.toList());
            
            double sumSalary = employees.stream()
            .filter(e -> e.getName().toUpperCase().charAt(0) == 'M')
            .mapToDouble(e -> e.getSalary())
            .sum();
            
            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");
            for (String email : emails) {
                System.out.println(email);
            }
            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sumSalary));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}