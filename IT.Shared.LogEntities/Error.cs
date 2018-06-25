using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IT.Shared.LogEntities
{
    public class Error
    {
    //    private Guid _ID;
        public Guid ID
        {
            get;
            set;
        }
      //  private string _AppName;
      
        public string AppName
        {
            get;
        
            set;
        }
      //  private int _ErrorNumber;
        public int ErrorNumber
        {
            get;
            set;  
        }
      //  private string _Description;
        public string Description
        {
            get;
            set;
        }
      //  private string _Source;
        public string Source
        {
            get;
            set;
        }
       // private int _Severity;
        public int Severity
        {
            get;
            set;
        }
      //  private int _DebugInfo;
        public string DebugInfo
        {
            get;
            set;
        }
      //  private DateTime _DateTime;
        public DateTime DateTime
        {
            get;
            set;
        }
      //  private string _MachineName;
        public string MachineName
        {
            get;
            set;
        }
      //  private string _SessionKey;
        public string SessionKey
        {
            get;
            set;
        }
       // private string _StackInfo;
        public string StackInfo
        {
            get;
            set;
        }
      //  private string _ExceptionInfo;
        public string ExceptionInfo
        {
            get;
            set;
        }
     //   private string _GeneralInfo;
        public string GeneralInfo
        {
            get;
            set;
        }
    }
}
