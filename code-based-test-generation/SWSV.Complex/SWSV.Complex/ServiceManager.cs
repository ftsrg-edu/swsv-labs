using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SWSV.Complex
{
    /// <summary>
    /// A singleton class that is able to manage one Service instance.
    /// </summary>
    public class ServiceManager
    {
        private static ServiceManager instance;

        public Service Service { get; private set; }

        private ServiceManager() { }

        /// <summary>
        /// Gets or creates the one and only ServiceManager instance.
        /// </summary>
        public static ServiceManager Instance
        {
            get
            {
                if (instance == null)
                {
                    instance = new ServiceManager();
                }
                return instance;
            }
        }

        /// <summary>
        /// Sets the current service under management to the other passed as argument.
        /// </summary>
        /// <param name="service">The new service to set as managed</param>
        public void SetService(Service service)
        {
            Service = service;
        }

    }
}
