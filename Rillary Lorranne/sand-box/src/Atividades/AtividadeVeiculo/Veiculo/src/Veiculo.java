public abstract class Veiculo {

        // DECLARAR VARIAVEIS
    
        private String Placa;  // modificador (public,private) - tipo e nome
        private int Ano;
        private int QtdPortas;
        private String Marca;
    
        // CRIAR UM CONSTRUTOR
         
        public Veiculo(String Placa, int Ano, int QtdPortas, String Marca){
            this.Placa = Placa;
            this.Ano = Ano;
            this.QtdPortas = QtdPortas;
            this.Marca = Marca;
        }
    
        // CRIAR METODOS (get e set)
        // GET
        public String getPlaca(){
            return Placa;
        }
        public int getAno(){
            return Ano;
        }
        public int getQtdPortas(){
            return QtdPortas;
        }
        public String getMarca(){
            return Marca;
        }
    
        
        // SET
        public void setPlaca(String Placa){
            this.Placa = Placa;
        }
        public void setAno(int Ano){
            this.Ano = Ano;
        }
        public void setQtdPortas(int QtdPortas){
            this.QtdPortas = QtdPortas;
        }
        public void setMarca(String Marca){
            this.Marca = Marca;
        }
        
        // PEGAR INFORMACOES
         
        public void ExibirInformacoes(){
            System.out.println("Placa: "+ getPlaca()+ "\nAno : "+ getAno());
            
        }
        abstract void ligar();

        public String getCombustivel() {
            return "energia";
        }
    
        }
    
