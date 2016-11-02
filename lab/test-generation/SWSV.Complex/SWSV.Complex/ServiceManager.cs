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
        /// Replaces the current service with the other one passed as argument.
        /// </summary>
        /// <param name="service">The new service replacing the current one</param>
        public void ReplaceService(Service service)
        {
            Service = service;
        }

    }
}
