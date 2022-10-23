# coding: utf-8

"""
    Cloud Build API

    Creates and manages builds on Google Cloud Platform.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.source import Source

class TestSource(unittest.TestCase):
    """Source unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Source:
        """Test Source
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Source`
        """
        model = Source()
        if include_optional:
            return Source(
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
                    object = '', )
            )
        else:
            return Source(
        )
        """

    def testSource(self):
        """Test Source"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
