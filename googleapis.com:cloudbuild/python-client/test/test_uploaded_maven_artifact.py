# coding: utf-8

"""
    Cloud Build API

    Creates and manages builds on Google Cloud Platform.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.uploaded_maven_artifact import UploadedMavenArtifact

class TestUploadedMavenArtifact(unittest.TestCase):
    """UploadedMavenArtifact unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UploadedMavenArtifact:
        """Test UploadedMavenArtifact
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UploadedMavenArtifact`
        """
        model = UploadedMavenArtifact()
        if include_optional:
            return UploadedMavenArtifact(
                file_hashes = openapi_client.models.file_hashes.FileHashes(
                    file_hash = [
                        openapi_client.models.hash.Hash(
                            type = 'NONE', 
                            value = 'YQ==', )
                        ], ),
                push_timing = openapi_client.models.time_span.TimeSpan(
                    end_time = '', 
                    start_time = '', ),
                uri = ''
            )
        else:
            return UploadedMavenArtifact(
        )
        """

    def testUploadedMavenArtifact(self):
        """Test UploadedMavenArtifact"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
