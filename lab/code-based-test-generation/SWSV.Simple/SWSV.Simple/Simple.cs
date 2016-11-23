using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SWSV.Simple
{
    public class Simple
    {
        public bool IfBranching(int condition)
        {
            if (condition > 10)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        public int SwitchBranching(int condition)
        {
            var divider = 0;
            switch (condition)
            {
                case 0:
                    return 0;
                case 1:
                    return -1;
                case 2:
                    return -2;
                default:
                    return (condition / divider);
            };
        }

        public void ForLoop(int bound, bool decision)
        {
            for (int i = 0; i < bound; i++)
            {
                if (decision)
                {
                    Console.WriteLine("True decision");
                }
                else
                {
                    Console.WriteLine("False decision");
                }
            }
        }

        public int SwitchAndFor(int type, bool b, int bound)
        {
            switch (type)
            {
                case 0:
                    int sum = 0;
                    for (int i = 0; i < 3; i++)
                    {
                        sum += i;
                        if (i == bound)
                        {
                            break;
                        }
                    }
                    return sum;
                case 1:
                    if (b)
                    {
                        return 1;
                    }
                    break;
                default:
                    break;
            }

            return -1;
        }

    }
}
