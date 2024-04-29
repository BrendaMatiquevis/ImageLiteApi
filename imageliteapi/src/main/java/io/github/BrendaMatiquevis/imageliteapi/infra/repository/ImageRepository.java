package io.github.BrendaMatiquevis.imageliteapi.infra.repository;

import io.github.BrendaMatiquevis.imageliteapi.domain.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, String> {
}
