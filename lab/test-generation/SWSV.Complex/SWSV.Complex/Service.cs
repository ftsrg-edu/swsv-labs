using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SWSV.Complex
{
    /// <summary>
    /// A simple class representing a stateful service with multiple states.
    /// </summary>
    public class Service
    {
        public string Name { get; private set; }

        public ServiceState State { get; private set; }

        /// <summary>
        /// Creates and instances of the service with a predefined name.
        /// </summary>
        /// <param name="name">The name of the new service</param>
        public Service(string name)
        {
            Name = name;
            State = ServiceState.Inactive;
        }

        /// <summary>
        /// Initializes the service by setting its state.
        /// </summary>
        public void Initalize()
        {
            State = ServiceState.Initializing;
        }

        /// <summary>
        /// Activates the service by setting its state.
        /// </summary>
        public void Activate()
        {
            if (State == ServiceState.Initializing)
            {
                State = ServiceState.Active;
            }
        }

        /// <summary>
        /// Returns values based on the current state of the service.
        /// </summary>
        /// <returns>The value representing the service state</returns>
        public int DoService()
        {
            switch(State)
            {
                case ServiceState.Initializing:
                    return 1;
                case ServiceState.Active:
                    return 2;
                default:
                    return 0;
            }
        }
    }
}
