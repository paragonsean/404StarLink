# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.bundle_id_relationships_bundle_id_capabilities_data_inner import BundleIdRelationshipsBundleIdCapabilitiesDataInner

class TestBundleIdRelationshipsBundleIdCapabilitiesDataInner(unittest.TestCase):
    """BundleIdRelationshipsBundleIdCapabilitiesDataInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> BundleIdRelationshipsBundleIdCapabilitiesDataInner:
        """Test BundleIdRelationshipsBundleIdCapabilitiesDataInner
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `BundleIdRelationshipsBundleIdCapabilitiesDataInner`
        """
        model = BundleIdRelationshipsBundleIdCapabilitiesDataInner()
        if include_optional:
            return BundleIdRelationshipsBundleIdCapabilitiesDataInner(
                id = '',
                type = 'bundleIdCapabilities'
            )
        else:
            return BundleIdRelationshipsBundleIdCapabilitiesDataInner(
                id = '',
                type = 'bundleIdCapabilities',
        )
        """

    def testBundleIdRelationshipsBundleIdCapabilitiesDataInner(self):
        """Test BundleIdRelationshipsBundleIdCapabilitiesDataInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
