package com.githubuserbranchesapi.domain.dto;

import java.util.List;

public record RepositoryResponseDto(
        String repositoryName,
        String ownerLogin,
        List<BranchInfoResponseDto> branches
) {
}
