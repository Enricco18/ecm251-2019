package utilities;

public enum CardValues {
    DOIS(2),TRES(3),QUATRO(4),CINCO(5),SEIS(6),SETE(7),OITO(8),NOVE(9),DEZ(10),J(11),Q(12),K(13),A(14);

    public int valorCarta;
    CardValues(int valor) {
        valorCarta = valor;
    }
}