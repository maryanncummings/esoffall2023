using System;
namespace XXDesignPatternExample
{
    public class DebitCardPayment : IPayment
    {
        public void Pay(double amount)
        {
            Console.WriteLine("Customer pays Rs " + amount + " using Debit Card");
        }
    }
}
