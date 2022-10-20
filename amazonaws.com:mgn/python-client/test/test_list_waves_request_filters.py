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

from openapi_client.models.list_waves_request_filters import ListWavesRequestFilters

class TestListWavesRequestFilters(unittest.TestCase):
    """ListWavesRequestFilters unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ListWavesRequestFilters:
        """Test ListWavesRequestFilters
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ListWavesRequestFilters`
        """
        model = ListWavesRequestFilters()
        if include_optional:
            return ListWavesRequestFilters(
                is_archived = None,
                wave_ids = None
            )
        else:
            return ListWavesRequestFilters(
        )
        """

    def testListWavesRequestFilters(self):
        """Test ListWavesRequestFilters"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
