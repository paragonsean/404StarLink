# coding: utf-8

"""
    Amazon Pinpoint

    Doc Engage API - Amazon Pinpoint API

    The version of the OpenAPI document: 2016-12-01
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class CreateRecommenderConfiguration(BaseModel):
    """
    Specifies Amazon Pinpoint configuration settings for retrieving and processing recommendation data from a recommender model.
    """ # noqa: E501
    attributes: Optional[Any] = Field(default=None, alias="Attributes")
    description: Optional[Any] = Field(default=None, alias="Description")
    name: Optional[Any] = Field(default=None, alias="Name")
    recommendation_provider_id_type: Optional[Any] = Field(default=None, alias="RecommendationProviderIdType")
    recommendation_provider_role_arn: Any = Field(alias="RecommendationProviderRoleArn")
    recommendation_provider_uri: Any = Field(alias="RecommendationProviderUri")
    recommendation_transformer_uri: Optional[Any] = Field(default=None, alias="RecommendationTransformerUri")
    recommendations_display_name: Optional[Any] = Field(default=None, alias="RecommendationsDisplayName")
    recommendations_per_message: Optional[Any] = Field(default=None, alias="RecommendationsPerMessage")
    __properties: ClassVar[List[str]] = ["Attributes", "Description", "Name", "RecommendationProviderIdType", "RecommendationProviderRoleArn", "RecommendationProviderUri", "RecommendationTransformerUri", "RecommendationsDisplayName", "RecommendationsPerMessage"]

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
        """Create an instance of CreateRecommenderConfiguration from a JSON string"""
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
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of CreateRecommenderConfiguration from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "Attributes": obj.get("Attributes"),
            "Description": obj.get("Description"),
            "Name": obj.get("Name"),
            "RecommendationProviderIdType": obj.get("RecommendationProviderIdType"),
            "RecommendationProviderRoleArn": obj.get("RecommendationProviderRoleArn"),
            "RecommendationProviderUri": obj.get("RecommendationProviderUri"),
            "RecommendationTransformerUri": obj.get("RecommendationTransformerUri"),
            "RecommendationsDisplayName": obj.get("RecommendationsDisplayName"),
            "RecommendationsPerMessage": obj.get("RecommendationsPerMessage")
        })
        return _obj


