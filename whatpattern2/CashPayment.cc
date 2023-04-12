using System;
namespace XXDesignPatternExample
{
    public class CashPayment : IPayment
    {
        public void Pay(double amount)
        {
            Console.WriteLine("Customer pays Rs " + amount + " By Cash");
        }
    }
}
