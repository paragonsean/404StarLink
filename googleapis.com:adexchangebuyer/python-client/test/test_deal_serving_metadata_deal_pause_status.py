# coding: utf-8

"""
    Ad Exchange Buyer API

    Accesses your bidding-account information, submits creatives for validation, finds available direct deals, and retrieves performance reports.

    The version of the OpenAPI document: v1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.deal_serving_metadata_deal_pause_status import DealServingMetadataDealPauseStatus

class TestDealServingMetadataDealPauseStatus(unittest.TestCase):
    """DealServingMetadataDealPauseStatus unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> DealServingMetadataDealPauseStatus:
        """Test DealServingMetadataDealPauseStatus
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `DealServingMetadataDealPauseStatus`
        """
        model = DealServingMetadataDealPauseStatus()
        if include_optional:
            return DealServingMetadataDealPauseStatus(
                buyer_pause_reason = '',
                first_paused_by = '',
                has_buyer_paused = True,
                has_seller_paused = True,
                seller_pause_reason = ''
            )
        else:
            return DealServingMetadataDealPauseStatus(
        )
        """

    def testDealServingMetadataDealPauseStatus(self):
        """Test DealServingMetadataDealPauseStatus"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
