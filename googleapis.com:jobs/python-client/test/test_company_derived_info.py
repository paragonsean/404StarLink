# coding: utf-8

"""
    Cloud Talent Solution API

    Cloud Talent Solution provides the capability to create, read, update, and delete job postings, as well as search jobs based on keywords and filters. 

    The version of the OpenAPI document: v3p1beta1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.company_derived_info import CompanyDerivedInfo

class TestCompanyDerivedInfo(unittest.TestCase):
    """CompanyDerivedInfo unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CompanyDerivedInfo:
        """Test CompanyDerivedInfo
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CompanyDerivedInfo`
        """
        model = CompanyDerivedInfo()
        if include_optional:
            return CompanyDerivedInfo(
                headquarters_location = openapi_client.models.location.Location(
                    lat_lng = openapi_client.models.lat_lng.LatLng(
                        latitude = 1.337, 
                        longitude = 1.337, ), 
                    location_type = 'LOCATION_TYPE_UNSPECIFIED', 
                    postal_address = openapi_client.models.postal_address.PostalAddress(
                        address_lines = [
                            ''
                            ], 
                        administrative_area = '', 
                        language_code = '', 
                        locality = '', 
                        organization = '', 
                        postal_code = '', 
                        recipients = [
                            ''
                            ], 
                        region_code = '', 
                        revision = 56, 
                        sorting_code = '', 
                        sublocality = '', ), 
                    radius_in_miles = 1.337, )
            )
        else:
            return CompanyDerivedInfo(
        )
        """

    def testCompanyDerivedInfo(self):
        """Test CompanyDerivedInfo"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
