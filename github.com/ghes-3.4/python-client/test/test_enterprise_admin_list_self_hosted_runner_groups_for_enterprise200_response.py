# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.enterprise_admin_list_self_hosted_runner_groups_for_enterprise200_response import EnterpriseAdminListSelfHostedRunnerGroupsForEnterprise200Response

class TestEnterpriseAdminListSelfHostedRunnerGroupsForEnterprise200Response(unittest.TestCase):
    """EnterpriseAdminListSelfHostedRunnerGroupsForEnterprise200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> EnterpriseAdminListSelfHostedRunnerGroupsForEnterprise200Response:
        """Test EnterpriseAdminListSelfHostedRunnerGroupsForEnterprise200Response
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `EnterpriseAdminListSelfHostedRunnerGroupsForEnterprise200Response`
        """
        model = EnterpriseAdminListSelfHostedRunnerGroupsForEnterprise200Response()
        if include_optional:
            return EnterpriseAdminListSelfHostedRunnerGroupsForEnterprise200Response(
                runner_groups = [
                    openapi_client.models.runner_groups_enterprise.runner-groups-enterprise(
                        allows_public_repositories = True, 
                        default = True, 
                        id = 1.337, 
                        name = '', 
                        runners_url = '', 
                        selected_organizations_url = '', 
                        visibility = '', )
                    ],
                total_count = 1.337
            )
        else:
            return EnterpriseAdminListSelfHostedRunnerGroupsForEnterprise200Response(
                runner_groups = [
                    openapi_client.models.runner_groups_enterprise.runner-groups-enterprise(
                        allows_public_repositories = True, 
                        default = True, 
                        id = 1.337, 
                        name = '', 
                        runners_url = '', 
                        selected_organizations_url = '', 
                        visibility = '', )
                    ],
                total_count = 1.337,
        )
        """

    def testEnterpriseAdminListSelfHostedRunnerGroupsForEnterprise200Response(self):
        """Test EnterpriseAdminListSelfHostedRunnerGroupsForEnterprise200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
