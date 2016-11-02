using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SWSV.Complex
{
    public class ServiceConsumer
    {
        /// <summary>
        /// Consumes a service provided by the ServiceManager singleton instance. The manager itself is known to be non-null.
        /// </summary>
        /// <param name="manager">The ServiceManager singleton instance</param>
        /// <returns>Returns a value based on the service state, which can be only -1, 0, 1 or 2.</returns>
        public int ConsumeService(ServiceManager manager)
        {
            var service = manager.Service;
            if(service == null)
            {
                return -1;
            }
            return service.DoService();
        }
    }
}
