package mate.academy.springboot.datajpa.service.mapper;

public interface ResponseDtoMapper<M, D> {
    D fromModel(M model);
}
