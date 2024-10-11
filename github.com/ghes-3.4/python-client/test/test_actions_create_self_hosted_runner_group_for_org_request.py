# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.actions_create_self_hosted_runner_group_for_org_request import ActionsCreateSelfHostedRunnerGroupForOrgRequest

class TestActionsCreateSelfHostedRunnerGroupForOrgRequest(unittest.TestCase):
    """ActionsCreateSelfHostedRunnerGroupForOrgRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ActionsCreateSelfHostedRunnerGroupForOrgRequest:
        """Test ActionsCreateSelfHostedRunnerGroupForOrgRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ActionsCreateSelfHostedRunnerGroupForOrgRequest`
        """
        model = ActionsCreateSelfHostedRunnerGroupForOrgRequest()
        if include_optional:
            return ActionsCreateSelfHostedRunnerGroupForOrgRequest(
                allows_public_repositories = True,
                name = '',
                runners = [
                    56
                    ],
                selected_repository_ids = [
                    56
                    ],
                visibility = 'all'
            )
        else:
            return ActionsCreateSelfHostedRunnerGroupForOrgRequest(
                name = '',
        )
        """

    def testActionsCreateSelfHostedRunnerGroupForOrgRequest(self):
        """Test ActionsCreateSelfHostedRunnerGroupForOrgRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
