namespace XXDesignPatternExample
{
   public class Payment
    {
        private IPayment ip;
        public void SetPayment(IPayment inp)
        {
            this.ip = inp;
        }
        public void Pay(double amount)
        {
            ip.Pay(amount);
        }
    }
}
