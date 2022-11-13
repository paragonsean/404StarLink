# coding: utf-8

"""
    Master Data API - v2

    # ATTENTION: **This version isn't compliant with data entities of old version (e.g. CL and AD). It's possible to use this configuration only to new data entities.**      ## Welcome!    VTEX Master Data is an easy-to-use, secure, fast, scalable and extensible repository. On it you can create your own Entities, store data and consult directly from the storefront or use it to store info for some external integration.    There are internal VTEX modules that use VTEX Master Data as data repository. We have the VTEX Customer Service, VTEX Profile System and VTEX InStore, for example. It is also used by other internal services.    There are two ways to use Master Data:    1. Directly from the storefront  2. External integration    ### Directly from the storefront    If your scenario is to be used inside the storefront, be aware of the following observations:    1. Use the storefront host to query or store information to avoid **CORS**;  2. Configure which information should be public and which shouldn't, inside the JSON Schema of the Data Entity;  3. Do not create query loops (the storefront may be affected with Throttling and apis may be turned off as a security protection);  4. Never add via JS any type of authentication key (x-vtex-api-appkey or x-vtex-api-apptoken);    **It's important to avoid CORS using the relative path**    ### External Integration    If your scenario is to perform external integration, such as migrating client data from another service, be aware of the following observations:    1. Use the host ```{{accountName}}.vtexcommercestable.com.br```;  2. Use the authentication keys (x-vtex-api-appkey ou x-vtex-api-apptoken);    ### Most used attributes listed here    | Name | Description |  | -------- | -------- |  | accountName | Account name in VTEX License Manager |  | name | Data Entity name |  | schema | JSON Schema of a Data Entity |  | id | Identifier of a document |  | x-vtex-api-appKey | User key |  | x-vtex-api-appToken | User token |

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict
from typing import Any, ClassVar, Dict, List
from openapi_client.models.properties import Properties
from typing import Optional, Set
from typing_extensions import Self

class SaveschemabynameRequest(BaseModel):
    """
    SaveschemabynameRequest
    """ # noqa: E501
    properties: Properties
    __properties: ClassVar[List[str]] = ["properties"]

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
        """Create an instance of SaveschemabynameRequest from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of properties
        if self.properties:
            _dict['properties'] = self.properties.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of SaveschemabynameRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "properties": Properties.from_dict(obj["properties"]) if obj.get("properties") is not None else None
        })
        return _obj


