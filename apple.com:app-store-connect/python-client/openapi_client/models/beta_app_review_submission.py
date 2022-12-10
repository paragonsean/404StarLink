# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.beta_app_review_submission_attributes import BetaAppReviewSubmissionAttributes
from openapi_client.models.beta_app_review_submission_relationships import BetaAppReviewSubmissionRelationships
from openapi_client.models.resource_links import ResourceLinks
from typing import Optional, Set
from typing_extensions import Self

class BetaAppReviewSubmission(BaseModel):
    """
    BetaAppReviewSubmission
    """ # noqa: E501
    attributes: Optional[BetaAppReviewSubmissionAttributes] = None
    id: StrictStr
    links: ResourceLinks
    relationships: Optional[BetaAppReviewSubmissionRelationships] = None
    type: StrictStr
    __properties: ClassVar[List[str]] = ["attributes", "id", "links", "relationships", "type"]

    @field_validator('type')
    def type_validate_enum(cls, value):
        """Validates the enum"""
        if value not in set(['betaAppReviewSubmissions']):
            raise ValueError("must be one of enum values ('betaAppReviewSubmissions')")
        return value

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
        """Create an instance of BetaAppReviewSubmission from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of attributes
        if self.attributes:
            _dict['attributes'] = self.attributes.to_dict()
        # override the default output from pydantic by calling `to_dict()` of links
        if self.links:
            _dict['links'] = self.links.to_dict()
        # override the default output from pydantic by calling `to_dict()` of relationships
        if self.relationships:
            _dict['relationships'] = self.relationships.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of BetaAppReviewSubmission from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "attributes": BetaAppReviewSubmissionAttributes.from_dict(obj["attributes"]) if obj.get("attributes") is not None else None,
            "id": obj.get("id"),
            "links": ResourceLinks.from_dict(obj["links"]) if obj.get("links") is not None else None,
            "relationships": BetaAppReviewSubmissionRelationships.from_dict(obj["relationships"]) if obj.get("relationships") is not None else None,
            "type": obj.get("type")
        })
        return _obj


