# coding: utf-8

"""
    AdMob API

    The AdMob API allows publishers to programmatically get information about their AdMob account. 

    The version of the OpenAPI document: v1beta
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.publisher_account import PublisherAccount
from typing import Optional, Set
from typing_extensions import Self

class ListPublisherAccountsResponse(BaseModel):
    """
    Response for the publisher account list request.
    """ # noqa: E501
    account: Optional[List[PublisherAccount]] = Field(default=None, description="Publisher that the client credentials can access.")
    next_page_token: Optional[StrictStr] = Field(default=None, description="If not empty, indicates that there might be more accounts for the request; you must pass this value in a new `ListPublisherAccountsRequest`.", alias="nextPageToken")
    __properties: ClassVar[List[str]] = ["account", "nextPageToken"]

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
        """Create an instance of ListPublisherAccountsResponse from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in account (list)
        _items = []
        if self.account:
            for _item_account in self.account:
                if _item_account:
                    _items.append(_item_account.to_dict())
            _dict['account'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ListPublisherAccountsResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "account": [PublisherAccount.from_dict(_item) for _item in obj["account"]] if obj.get("account") is not None else None,
            "nextPageToken": obj.get("nextPageToken")
        })
        return _obj


