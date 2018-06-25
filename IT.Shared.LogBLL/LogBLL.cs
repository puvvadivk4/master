using IT.Shared.LogEntities;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using IT.Shared.LogDAL;

namespace IT.Shared.LogBLL
{
    public class LogBLL
    {
        LogDAL.LogDAL dal;
        public List<Error> ErrorBLL(Error error, String environment)
        {

            dal = new LogDAL.LogDAL();
            return dal.ErrorDAL(error, environment);

        }
        public List<Message> MessageBLL(Message message, String environment)
        {
            dal = new LogDAL.LogDAL();
            return  dal.MessagDAL(message, environment);
        }
    }
}
