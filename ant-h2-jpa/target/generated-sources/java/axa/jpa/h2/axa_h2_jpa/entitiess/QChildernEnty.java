package axa.jpa.h2.axa_h2_jpa.entitiess;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChildernEnty is a Querydsl query type for ChildernEnty
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QChildernEnty extends EntityPathBase<ChildernEnty> {

    private static final long serialVersionUID = 1806503701L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChildernEnty childernEnty = new QChildernEnty("childernEnty");

    public final SetPath<ChildAddresses, QChildAddresses> childAddressList = this.<ChildAddresses, QChildAddresses>createSet("childAddressList", ChildAddresses.class, QChildAddresses.class, PathInits.DIRECT2);

    public final NumberPath<Integer> childId = createNumber("childId", Integer.class);

    public final QEmployeeEntety emp;

    public final StringPath name = createString("name");

    public QChildernEnty(String variable) {
        this(ChildernEnty.class, forVariable(variable), INITS);
    }

    public QChildernEnty(Path<? extends ChildernEnty> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChildernEnty(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChildernEnty(PathMetadata metadata, PathInits inits) {
        this(ChildernEnty.class, metadata, inits);
    }

    public QChildernEnty(Class<? extends ChildernEnty> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.emp = inits.isInitialized("emp") ? new QEmployeeEntety(forProperty("emp")) : null;
    }

}

