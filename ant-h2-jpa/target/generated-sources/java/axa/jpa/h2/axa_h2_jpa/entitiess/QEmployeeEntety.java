package axa.jpa.h2.axa_h2_jpa.entitiess;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEmployeeEntety is a Querydsl query type for EmployeeEntety
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEmployeeEntety extends EntityPathBase<EmployeeEntety> {

    private static final long serialVersionUID = -926628241L;

    public static final QEmployeeEntety employeeEntety = new QEmployeeEntety("employeeEntety");

    public final SetPath<ChildernEnty, QChildernEnty> childList = this.<ChildernEnty, QChildernEnty>createSet("childList", ChildernEnty.class, QChildernEnty.class, PathInits.DIRECT2);

    public final NumberPath<Integer> empId = createNumber("empId", Integer.class);

    public final StringPath name = createString("name");

    public final NumberPath<Double> salary = createNumber("salary", Double.class);

    public QEmployeeEntety(String variable) {
        super(EmployeeEntety.class, forVariable(variable));
    }

    public QEmployeeEntety(Path<? extends EmployeeEntety> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEmployeeEntety(PathMetadata metadata) {
        super(EmployeeEntety.class, metadata);
    }

}

