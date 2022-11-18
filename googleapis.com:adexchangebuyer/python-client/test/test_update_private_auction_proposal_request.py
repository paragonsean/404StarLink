# coding: utf-8

"""
    Ad Exchange Buyer API

    Accesses your bidding-account information, submits creatives for validation, finds available direct deals, and retrieves performance reports.

    The version of the OpenAPI document: v1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.update_private_auction_proposal_request import UpdatePrivateAuctionProposalRequest

class TestUpdatePrivateAuctionProposalRequest(unittest.TestCase):
    """UpdatePrivateAuctionProposalRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UpdatePrivateAuctionProposalRequest:
        """Test UpdatePrivateAuctionProposalRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UpdatePrivateAuctionProposalRequest`
        """
        model = UpdatePrivateAuctionProposalRequest()
        if include_optional:
            return UpdatePrivateAuctionProposalRequest(
                external_deal_id = '',
                note = openapi_client.models.marketplace_note.MarketplaceNote(
                    creator_role = '', 
                    deal_id = '', 
                    kind = 'adexchangebuyer#marketplaceNote', 
                    note = '', 
                    note_id = '', 
                    proposal_id = '', 
                    proposal_revision_number = '', 
                    timestamp_ms = '', ),
                proposal_revision_number = '',
                update_action = ''
            )
        else:
            return UpdatePrivateAuctionProposalRequest(
        )
        """

    def testUpdatePrivateAuctionProposalRequest(self):
        """Test UpdatePrivateAuctionProposalRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
