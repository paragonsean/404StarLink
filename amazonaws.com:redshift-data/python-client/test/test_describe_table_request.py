# coding: utf-8

"""
    Redshift Data API Service

    <p>You can use the Amazon Redshift Data API to run queries on Amazon Redshift tables. You can run SQL statements, which are committed if the statement succeeds. </p> <p>For more information about the Amazon Redshift Data API and CLI usage examples, see <a href=\"https://docs.aws.amazon.com/redshift/latest/mgmt/data-api.html\">Using the Amazon Redshift Data API</a> in the <i>Amazon Redshift Management Guide</i>. </p>

    The version of the OpenAPI document: 2019-12-20
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.describe_table_request import DescribeTableRequest

class TestDescribeTableRequest(unittest.TestCase):
    """DescribeTableRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> DescribeTableRequest:
        """Test DescribeTableRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `DescribeTableRequest`
        """
        model = DescribeTableRequest()
        if include_optional:
            return DescribeTableRequest(
                cluster_identifier = None,
                connected_database = None,
                database = None,
                db_user = None,
                max_results = None,
                next_token = None,
                var_schema = None,
                secret_arn = None,
                table = None,
                workgroup_name = None
            )
        else:
            return DescribeTableRequest(
                database = None,
        )
        """

    def testDescribeTableRequest(self):
        """Test DescribeTableRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
