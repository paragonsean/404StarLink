# coding: utf-8

"""
    Ad Exchange Buyer API

    Accesses your bidding-account information, submits creatives for validation, finds available direct deals, and retrieves performance reports.

    The version of the OpenAPI document: v1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.buyer import Buyer
from openapi_client.models.contact_information import ContactInformation
from openapi_client.models.marketplace_label import MarketplaceLabel
from openapi_client.models.private_data import PrivateData
from openapi_client.models.seller import Seller
from typing import Optional, Set
from typing_extensions import Self

class Proposal(BaseModel):
    """
    Represents a proposal in the marketplace. A proposal is the unit of negotiation between a seller and a buyer and contains deals which are served. Each field in a proposal can have one of the following setting:  (readonly) - It is an error to try and set this field. (buyer-readonly) - Only the seller can set this field. (seller-readonly) - Only the buyer can set this field. (updatable) - The field is updatable at all times by either buyer or the seller.
    """ # noqa: E501
    billed_buyer: Optional[Buyer] = Field(default=None, alias="billedBuyer")
    buyer: Optional[Buyer] = None
    buyer_contacts: Optional[List[ContactInformation]] = Field(default=None, description="Optional contact information of the buyer. (seller-readonly)", alias="buyerContacts")
    buyer_private_data: Optional[PrivateData] = Field(default=None, alias="buyerPrivateData")
    dbm_advertiser_ids: Optional[List[StrictStr]] = Field(default=None, description="IDs of DBM advertisers permission to this proposal.", alias="dbmAdvertiserIds")
    has_buyer_signed_off: Optional[StrictBool] = Field(default=None, description="When an proposal is in an accepted state, indicates whether the buyer has signed off. Once both sides have signed off on a deal, the proposal can be finalized by the seller. (seller-readonly)", alias="hasBuyerSignedOff")
    has_seller_signed_off: Optional[StrictBool] = Field(default=None, description="When an proposal is in an accepted state, indicates whether the buyer has signed off Once both sides have signed off on a deal, the proposal can be finalized by the seller. (buyer-readonly)", alias="hasSellerSignedOff")
    inventory_source: Optional[StrictStr] = Field(default=None, description="What exchange will provide this inventory (readonly, except on create).", alias="inventorySource")
    is_renegotiating: Optional[StrictBool] = Field(default=None, description="True if the proposal is being renegotiated (readonly).", alias="isRenegotiating")
    is_setup_complete: Optional[StrictBool] = Field(default=None, description="True, if the buyside inventory setup is complete for this proposal. (readonly, except via OrderSetupCompleted action) Deprecated in favor of deal level setup complete flag.", alias="isSetupComplete")
    kind: Optional[StrictStr] = Field(default='adexchangebuyer#proposal', description="Identifies what kind of resource this is. Value: the fixed string \"adexchangebuyer#proposal\".")
    labels: Optional[List[MarketplaceLabel]] = Field(default=None, description="List of labels associated with the proposal. (readonly)")
    last_updater_or_commentor_role: Optional[StrictStr] = Field(default=None, description="The role of the last user that either updated the proposal or left a comment. (readonly)", alias="lastUpdaterOrCommentorRole")
    name: Optional[StrictStr] = Field(default=None, description="The name for the proposal (updatable)")
    negotiation_id: Optional[StrictStr] = Field(default=None, description="Optional negotiation id if this proposal is a preferred deal proposal.", alias="negotiationId")
    originator_role: Optional[StrictStr] = Field(default=None, description="Indicates whether the buyer/seller created the proposal.(readonly)", alias="originatorRole")
    private_auction_id: Optional[StrictStr] = Field(default=None, description="Optional private auction id if this proposal is a private auction proposal.", alias="privateAuctionId")
    proposal_id: Optional[StrictStr] = Field(default=None, description="The unique id of the proposal. (readonly).", alias="proposalId")
    proposal_state: Optional[StrictStr] = Field(default=None, description="The current state of the proposal. (readonly)", alias="proposalState")
    revision_number: Optional[StrictStr] = Field(default=None, description="The revision number for the proposal (readonly).", alias="revisionNumber")
    revision_time_ms: Optional[StrictStr] = Field(default=None, description="The time (ms since epoch) when the proposal was last revised (readonly).", alias="revisionTimeMs")
    seller: Optional[Seller] = None
    seller_contacts: Optional[List[ContactInformation]] = Field(default=None, description="Optional contact information of the seller (buyer-readonly).", alias="sellerContacts")
    __properties: ClassVar[List[str]] = ["billedBuyer", "buyer", "buyerContacts", "buyerPrivateData", "dbmAdvertiserIds", "hasBuyerSignedOff", "hasSellerSignedOff", "inventorySource", "isRenegotiating", "isSetupComplete", "kind", "labels", "lastUpdaterOrCommentorRole", "name", "negotiationId", "originatorRole", "privateAuctionId", "proposalId", "proposalState", "revisionNumber", "revisionTimeMs", "seller", "sellerContacts"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of Proposal from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of billed_buyer
        if self.billed_buyer:
            _dict['billedBuyer'] = self.billed_buyer.to_dict()
        # override the default output from pydantic by calling `to_dict()` of buyer
        if self.buyer:
            _dict['buyer'] = self.buyer.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in buyer_contacts (list)
        _items = []
        if self.buyer_contacts:
            for _item_buyer_contacts in self.buyer_contacts:
                if _item_buyer_contacts:
                    _items.append(_item_buyer_contacts.to_dict())
            _dict['buyerContacts'] = _items
        # override the default output from pydantic by calling `to_dict()` of buyer_private_data
        if self.buyer_private_data:
            _dict['buyerPrivateData'] = self.buyer_private_data.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in labels (list)
        _items = []
        if self.labels:
            for _item_labels in self.labels:
                if _item_labels:
                    _items.append(_item_labels.to_dict())
            _dict['labels'] = _items
        # override the default output from pydantic by calling `to_dict()` of seller
        if self.seller:
            _dict['seller'] = self.seller.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in seller_contacts (list)
        _items = []
        if self.seller_contacts:
            for _item_seller_contacts in self.seller_contacts:
                if _item_seller_contacts:
                    _items.append(_item_seller_contacts.to_dict())
            _dict['sellerContacts'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Proposal from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "billedBuyer": Buyer.from_dict(obj["billedBuyer"]) if obj.get("billedBuyer") is not None else None,
            "buyer": Buyer.from_dict(obj["buyer"]) if obj.get("buyer") is not None else None,
            "buyerContacts": [ContactInformation.from_dict(_item) for _item in obj["buyerContacts"]] if obj.get("buyerContacts") is not None else None,
            "buyerPrivateData": PrivateData.from_dict(obj["buyerPrivateData"]) if obj.get("buyerPrivateData") is not None else None,
            "dbmAdvertiserIds": obj.get("dbmAdvertiserIds"),
            "hasBuyerSignedOff": obj.get("hasBuyerSignedOff"),
            "hasSellerSignedOff": obj.get("hasSellerSignedOff"),
            "inventorySource": obj.get("inventorySource"),
            "isRenegotiating": obj.get("isRenegotiating"),
            "isSetupComplete": obj.get("isSetupComplete"),
            "kind": obj.get("kind") if obj.get("kind") is not None else 'adexchangebuyer#proposal',
            "labels": [MarketplaceLabel.from_dict(_item) for _item in obj["labels"]] if obj.get("labels") is not None else None,
            "lastUpdaterOrCommentorRole": obj.get("lastUpdaterOrCommentorRole"),
            "name": obj.get("name"),
            "negotiationId": obj.get("negotiationId"),
            "originatorRole": obj.get("originatorRole"),
            "privateAuctionId": obj.get("privateAuctionId"),
            "proposalId": obj.get("proposalId"),
            "proposalState": obj.get("proposalState"),
            "revisionNumber": obj.get("revisionNumber"),
            "revisionTimeMs": obj.get("revisionTimeMs"),
            "seller": Seller.from_dict(obj["seller"]) if obj.get("seller") is not None else None,
            "sellerContacts": [ContactInformation.from_dict(_item) for _item in obj["sellerContacts"]] if obj.get("sellerContacts") is not None else None
        })
        return _obj


