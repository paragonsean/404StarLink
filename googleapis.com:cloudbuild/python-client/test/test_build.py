# coding: utf-8

"""
    Cloud Build API

    Creates and manages builds on Google Cloud Platform.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.build import Build

class TestBuild(unittest.TestCase):
    """Build unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Build:
        """Test Build
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Build`
        """
        model = Build()
        if include_optional:
            return Build(
                approval = openapi_client.models.build_approval.BuildApproval(
                    config = openapi_client.models.approval_config.ApprovalConfig(
                        approval_required = True, ), 
                    result = openapi_client.models.approval_result.ApprovalResult(
                        approval_time = '', 
                        approver_account = '', 
                        comment = '', 
                        decision = 'DECISION_UNSPECIFIED', 
                        url = '', ), 
                    state = 'STATE_UNSPECIFIED', ),
                artifacts = openapi_client.models.artifacts.Artifacts(
                    images = [
                        ''
                        ], 
                    maven_artifacts = [
                        openapi_client.models.maven_artifact.MavenArtifact(
                            artifact_id = '', 
                            group_id = '', 
                            path = '', 
                            repository = '', 
                            version = '', )
                        ], 
                    npm_packages = [
                        openapi_client.models.npm_package.NpmPackage(
                            package_path = '', 
                            repository = '', )
                        ], 
                    objects = openapi_client.models.artifact_objects.ArtifactObjects(
                        location = '', 
                        paths = [
                            ''
                            ], 
                        timing = openapi_client.models.time_span.TimeSpan(
                            end_time = '', 
                            start_time = '', ), ), 
                    python_packages = [
                        openapi_client.models.python_package.PythonPackage(
                            repository = '', )
                        ], ),
                available_secrets = openapi_client.models.secrets.Secrets(
                    inline = [
                        openapi_client.models.inline_secret.InlineSecret(
                            env_map = {
                                'key' : 'YQ=='
                                }, 
                            kms_key_name = '', )
                        ], 
                    secret_manager = [
                        openapi_client.models.secret_manager_secret.SecretManagerSecret(
                            env = '', 
                            version_name = '', )
                        ], ),
                build_trigger_id = '',
                create_time = '',
                failure_info = openapi_client.models.failure_info.FailureInfo(
                    detail = '', 
                    type = 'FAILURE_TYPE_UNSPECIFIED', ),
                finish_time = '',
                id = '',
                images = [
                    ''
                    ],
                log_url = '',
                logs_bucket = '',
                name = '',
                options = openapi_client.models.build_options.BuildOptions(
                    default_logs_bucket_behavior = 'DEFAULT_LOGS_BUCKET_BEHAVIOR_UNSPECIFIED', 
                    disk_size_gb = '', 
                    dynamic_substitutions = True, 
                    env = [
                        ''
                        ], 
                    log_streaming_option = 'STREAM_DEFAULT', 
                    logging = 'LOGGING_UNSPECIFIED', 
                    machine_type = 'UNSPECIFIED', 
                    pool = openapi_client.models.pool_option.PoolOption(
                        name = '', ), 
                    requested_verify_option = 'NOT_VERIFIED', 
                    secret_env = [
                        ''
                        ], 
                    source_provenance_hash = [
                        'NONE'
                        ], 
                    substitution_option = 'MUST_MATCH', 
                    volumes = [
                        openapi_client.models.volume.Volume(
                            name = '', 
                            path = '', )
                        ], 
                    worker_pool = '', ),
                project_id = '',
                queue_ttl = '',
                results = openapi_client.models.results.Results(
                    artifact_manifest = '', 
                    artifact_timing = openapi_client.models.time_span.TimeSpan(
                        end_time = '', 
                        start_time = '', ), 
                    build_step_images = [
                        ''
                        ], 
                    build_step_outputs = [
                        'YQ=='
                        ], 
                    images = [
                        openapi_client.models.built_image.BuiltImage(
                            digest = '', 
                            name = '', 
                            push_timing = openapi_client.models.time_span.TimeSpan(
                                end_time = '', 
                                start_time = '', ), )
                        ], 
                    maven_artifacts = [
                        openapi_client.models.uploaded_maven_artifact.UploadedMavenArtifact(
                            file_hashes = openapi_client.models.file_hashes.FileHashes(
                                file_hash = [
                                    openapi_client.models.hash.Hash(
                                        type = 'NONE', 
                                        value = 'YQ==', )
                                    ], ), 
                            uri = '', )
                        ], 
                    npm_packages = [
                        openapi_client.models.uploaded_npm_package.UploadedNpmPackage(
                            uri = '', )
                        ], 
                    num_artifacts = '', 
                    python_packages = [
                        openapi_client.models.uploaded_python_package.UploadedPythonPackage(
                            uri = '', )
                        ], ),
                secrets = [
                    openapi_client.models.secret.Secret(
                        kms_key_name = '', 
                        secret_env = {
                            'key' : 'YQ=='
                            }, )
                    ],
                service_account = '',
                source = openapi_client.models.source.Source(
                    git_source = openapi_client.models.git_source.GitSource(
                        dir = '', 
                        revision = '', 
                        url = '', ), 
                    repo_source = openapi_client.models.repo_source.RepoSource(
                        branch_name = '', 
                        commit_sha = '', 
                        dir = '', 
                        invert_regex = True, 
                        project_id = '', 
                        repo_name = '', 
                        substitutions = {
                            'key' : ''
                            }, 
                        tag_name = '', ), 
                    storage_source = openapi_client.models.storage_source.StorageSource(
                        bucket = '', 
                        generation = '', 
                        object = '', ), 
                    storage_source_manifest = openapi_client.models.storage_source_manifest.StorageSourceManifest(
                        bucket = '', 
                        generation = '', 
                        object = '', ), ),
                source_provenance = openapi_client.models.source_provenance.SourceProvenance(
                    file_hashes = {
                        'key' : openapi_client.models.file_hashes.FileHashes(
                            file_hash = [
                                openapi_client.models.hash.Hash(
                                    type = 'NONE', 
                                    value = 'YQ==', )
                                ], )
                        }, 
                    resolved_repo_source = openapi_client.models.repo_source.RepoSource(
                        branch_name = '', 
                        commit_sha = '', 
                        dir = '', 
                        invert_regex = True, 
                        project_id = '', 
                        repo_name = '', 
                        substitutions = {
                            'key' : ''
                            }, 
                        tag_name = '', ), 
                    resolved_storage_source = openapi_client.models.storage_source.StorageSource(
                        bucket = '', 
                        generation = '', 
                        object = '', ), 
                    resolved_storage_source_manifest = openapi_client.models.storage_source_manifest.StorageSourceManifest(
                        bucket = '', 
                        generation = '', 
                        object = '', ), ),
                start_time = '',
                status = 'STATUS_UNKNOWN',
                status_detail = '',
                steps = [
                    openapi_client.models.build_step.BuildStep(
                        allow_exit_codes = [
                            56
                            ], 
                        allow_failure = True, 
                        args = [
                            ''
                            ], 
                        dir = '', 
                        entrypoint = '', 
                        env = [
                            ''
                            ], 
                        exit_code = 56, 
                        id = '', 
                        name = '', 
                        pull_timing = openapi_client.models.time_span.TimeSpan(
                            end_time = '', 
                            start_time = '', ), 
                        script = '', 
                        secret_env = [
                            ''
                            ], 
                        status = 'STATUS_UNKNOWN', 
                        timeout = '', 
                        timing = openapi_client.models.time_span.TimeSpan(
                            end_time = '', 
                            start_time = '', ), 
                        volumes = [
                            openapi_client.models.volume.Volume(
                                name = '', 
                                path = '', )
                            ], 
                        wait_for = [
                            ''
                            ], )
                    ],
                substitutions = {
                    'key' : ''
                    },
                tags = [
                    ''
                    ],
                timeout = '',
                timing = {
                    'key' : openapi_client.models.time_span.TimeSpan(
                        end_time = '', 
                        start_time = '', )
                    },
                warnings = [
                    openapi_client.models.warning.Warning(
                        priority = 'PRIORITY_UNSPECIFIED', 
                        text = '', )
                    ]
            )
        else:
            return Build(
        )
        """

    def testBuild(self):
        """Test Build"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
