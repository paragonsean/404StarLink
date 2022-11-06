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

from openapi_client.models.sub_statement_data import SubStatementData

class TestSubStatementData(unittest.TestCase):
    """SubStatementData unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> SubStatementData:
        """Test SubStatementData
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `SubStatementData`
        """
        model = SubStatementData()
        if include_optional:
            return SubStatementData(
                created_at = None,
                duration = None,
                error = None,
                has_result_set = None,
                id = None,
                query_string = None,
                redshift_query_id = None,
                result_rows = None,
                result_size = None,
                status = None,
                updated_at = None
            )
        else:
            return SubStatementData(
                id = None,
        )
        """

    def testSubStatementData(self):
        """Test SubStatementData"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
