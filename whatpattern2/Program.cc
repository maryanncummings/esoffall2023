using System;
namespace XXDesignPatternExample
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Please Select Payment Type : CreditCard or DebitCard or Cash");            
            string PaymentType = Console.ReadLine();
            Console.WriteLine("Payment type is : " + PaymentType);
            Console.WriteLine("\nPlease enter Amount to Pay : ");
            double Amount = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Amount is : " + Amount);
            Payment p = new Payment();
            
            if ("CreditCard".Equals(PaymentType, StringComparison.InvariantCultureIgnoreCase))
            {
                p.SetPayment(new CreditCardPayment());
            }
            else if ("DebitCard".Equals(PaymentType, StringComparison.InvariantCultureIgnoreCase))
            {
                p.SetPayment(new DebitCardPayment());
            }
            else if ("Cash".Equals(PaymentType, StringComparison.InvariantCultureIgnoreCase))
            {
                p.SetPayment(new CashPayment());
            }
            p.Pay(Amount);
            Console.ReadKey();
        }
    }
}
