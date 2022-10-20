# coding: utf-8

"""
    Application Migration Service

    The Application Migration Service service.

    The version of the OpenAPI document: 2020-02-26
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.describe_jobs_response import DescribeJobsResponse

class TestDescribeJobsResponse(unittest.TestCase):
    """DescribeJobsResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> DescribeJobsResponse:
        """Test DescribeJobsResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `DescribeJobsResponse`
        """
        model = DescribeJobsResponse()
        if include_optional:
            return DescribeJobsResponse(
                items = None,
                next_token = None
            )
        else:
            return DescribeJobsResponse(
        )
        """

    def testDescribeJobsResponse(self):
        """Test DescribeJobsResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
