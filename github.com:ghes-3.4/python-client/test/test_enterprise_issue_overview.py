# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.enterprise_issue_overview import EnterpriseIssueOverview

class TestEnterpriseIssueOverview(unittest.TestCase):
    """EnterpriseIssueOverview unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> EnterpriseIssueOverview:
        """Test EnterpriseIssueOverview
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `EnterpriseIssueOverview`
        """
        model = EnterpriseIssueOverview()
        if include_optional:
            return EnterpriseIssueOverview(
                closed_issues = 56,
                open_issues = 56,
                total_issues = 56
            )
        else:
            return EnterpriseIssueOverview(
                closed_issues = 56,
                open_issues = 56,
                total_issues = 56,
        )
        """

    def testEnterpriseIssueOverview(self):
        """Test EnterpriseIssueOverview"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
