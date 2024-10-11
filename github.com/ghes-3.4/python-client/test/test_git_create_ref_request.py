# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.git_create_ref_request import GitCreateRefRequest

class TestGitCreateRefRequest(unittest.TestCase):
    """GitCreateRefRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GitCreateRefRequest:
        """Test GitCreateRefRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GitCreateRefRequest`
        """
        model = GitCreateRefRequest()
        if include_optional:
            return GitCreateRefRequest(
                key = '"refs/heads/newbranch"',
                ref = '',
                sha = ''
            )
        else:
            return GitCreateRefRequest(
                ref = '',
                sha = '',
        )
        """

    def testGitCreateRefRequest(self):
        """Test GitCreateRefRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
