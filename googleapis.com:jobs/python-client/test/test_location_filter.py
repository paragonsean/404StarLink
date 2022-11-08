# coding: utf-8

"""
    Cloud Talent Solution API

    Cloud Talent Solution provides the capability to create, read, update, and delete job postings, as well as search jobs based on keywords and filters. 

    The version of the OpenAPI document: v3p1beta1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.location_filter import LocationFilter

class TestLocationFilter(unittest.TestCase):
    """LocationFilter unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> LocationFilter:
        """Test LocationFilter
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `LocationFilter`
        """
        model = LocationFilter()
        if include_optional:
            return LocationFilter(
                address = '',
                distance_in_miles = 1.337,
                lat_lng = openapi_client.models.lat_lng.LatLng(
                    latitude = 1.337, 
                    longitude = 1.337, ),
                region_code = '',
                telecommute_preference = 'TELECOMMUTE_PREFERENCE_UNSPECIFIED'
            )
        else:
            return LocationFilter(
        )
        """

    def testLocationFilter(self):
        """Test LocationFilter"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
