# coding: utf-8

"""
    Cloud Build API

    Creates and manages builds on Google Cloud Platform.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.batch_create_git_lab_connected_repositories_request import BatchCreateGitLabConnectedRepositoriesRequest

class TestBatchCreateGitLabConnectedRepositoriesRequest(unittest.TestCase):
    """BatchCreateGitLabConnectedRepositoriesRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> BatchCreateGitLabConnectedRepositoriesRequest:
        """Test BatchCreateGitLabConnectedRepositoriesRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `BatchCreateGitLabConnectedRepositoriesRequest`
        """
        model = BatchCreateGitLabConnectedRepositoriesRequest()
        if include_optional:
            return BatchCreateGitLabConnectedRepositoriesRequest(
                requests = [
                    openapi_client.models.create_git_lab_connected_repository_request.CreateGitLabConnectedRepositoryRequest(
                        gitlab_connected_repository = openapi_client.models.git_lab_connected_repository.GitLabConnectedRepository(
                            parent = '', 
                            repo = openapi_client.models.git_lab_repository_id.GitLabRepositoryId(
                                id = '', 
                                webhook_id = 56, ), 
                            status = openapi_client.models.status.Status(
                                code = 56, 
                                details = [
                                    {
                                        'key' : null
                                        }
                                    ], 
                                message = '', ), ), 
                        parent = '', )
                    ]
            )
        else:
            return BatchCreateGitLabConnectedRepositoriesRequest(
        )
        """

    def testBatchCreateGitLabConnectedRepositoriesRequest(self):
        """Test BatchCreateGitLabConnectedRepositoriesRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
