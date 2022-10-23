# coding: utf-8

"""
    Cloud Build API

    Creates and manages builds on Google Cloud Platform.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.run_build_trigger_request import RunBuildTriggerRequest

class TestRunBuildTriggerRequest(unittest.TestCase):
    """RunBuildTriggerRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> RunBuildTriggerRequest:
        """Test RunBuildTriggerRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `RunBuildTriggerRequest`
        """
        model = RunBuildTriggerRequest()
        if include_optional:
            return RunBuildTriggerRequest(
                project_id = '',
                source = openapi_client.models.repo_source.RepoSource(
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
                trigger_id = ''
            )
        else:
            return RunBuildTriggerRequest(
        )
        """

    def testRunBuildTriggerRequest(self):
        """Test RunBuildTriggerRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
