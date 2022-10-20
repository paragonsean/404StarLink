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

from openapi_client.models.list_applications_request import ListApplicationsRequest

class TestListApplicationsRequest(unittest.TestCase):
    """ListApplicationsRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ListApplicationsRequest:
        """Test ListApplicationsRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ListApplicationsRequest`
        """
        model = ListApplicationsRequest()
        if include_optional:
            return ListApplicationsRequest(
                filters = openapi_client.models.list_applications_request_filters.ListApplications_request_filters(
                    application_ids = null, 
                    is_archived = null, 
                    wave_ids = null, ),
                max_results = 1,
                next_token = ''
            )
        else:
            return ListApplicationsRequest(
        )
        """

    def testListApplicationsRequest(self):
        """Test ListApplicationsRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
