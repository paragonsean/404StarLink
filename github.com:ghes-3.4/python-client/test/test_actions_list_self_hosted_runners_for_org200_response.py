# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.actions_list_self_hosted_runners_for_org200_response import ActionsListSelfHostedRunnersForOrg200Response

class TestActionsListSelfHostedRunnersForOrg200Response(unittest.TestCase):
    """ActionsListSelfHostedRunnersForOrg200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ActionsListSelfHostedRunnersForOrg200Response:
        """Test ActionsListSelfHostedRunnersForOrg200Response
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ActionsListSelfHostedRunnersForOrg200Response`
        """
        model = ActionsListSelfHostedRunnersForOrg200Response()
        if include_optional:
            return ActionsListSelfHostedRunnersForOrg200Response(
                runners = [
                    openapi_client.models.self_hosted_runners.Self hosted runners(
                        busy = True, 
                        id = 5, 
                        labels = [
                            openapi_client.models.self_hosted_runner_label.Self hosted runner label(
                                id = 56, 
                                name = '', 
                                type = 'read-only', )
                            ], 
                        name = 'iMac', 
                        os = 'macos', 
                        status = 'online', )
                    ],
                total_count = 56
            )
        else:
            return ActionsListSelfHostedRunnersForOrg200Response(
                runners = [
                    openapi_client.models.self_hosted_runners.Self hosted runners(
                        busy = True, 
                        id = 5, 
                        labels = [
                            openapi_client.models.self_hosted_runner_label.Self hosted runner label(
                                id = 56, 
                                name = '', 
                                type = 'read-only', )
                            ], 
                        name = 'iMac', 
                        os = 'macos', 
                        status = 'online', )
                    ],
                total_count = 56,
        )
        """

    def testActionsListSelfHostedRunnersForOrg200Response(self):
        """Test ActionsListSelfHostedRunnersForOrg200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
