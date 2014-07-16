/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.spin.json;

import org.camunda.spin.Spin;
import org.camunda.spin.SpinList;

import java.util.List;

/**
 * A json node.
 * 
 * @author Thorben Lindhauer
 * @author Stefan Hentschel
 */
public abstract class SpinJsonNode extends Spin<SpinJsonNode> {

  /**
   * fetch a property by name
   *
   * @param name Name of the property
   * @return property SpinJsonNode representation of the property
   */
  public abstract SpinJsonNode prop(String name);

  /**
   * check if the given property contains a boolean value
   *
   * @return Boolean
   */
  public abstract Boolean isBoolean();

  /**
   * fetch boolean value of a property
   *
   * @return propertyValue value of type Boolean
   */
  public abstract Boolean boolValue();

  /**
   * check if the given property contains a number value
   *
   * @return Boolean
   */
  public abstract Boolean isNumber();

  /**
   * fetch number value of a property
   *
   * @return propertyValue value of type Number
   */
  public abstract Number numberValue();

  /**
   * check if the given property contains a String value
   *
   * @return Boolean
   */
  public abstract Boolean isString();

  /**
   * fetch string value of a property
   *
   * @return propertyValue value of type String
   */
  public abstract String stringValue();

  /**
   * check if the given property is a value node
   *
   * @return Boolean
   */
  public abstract Boolean isValue();

  /**
   * fetch value of a property as Object
   *
   * @return propertyValue value of type Object
   */
  public abstract Object value();

  /**
   * check if property is an array
   *
   * @return Boolean
   */
  public abstract Boolean isArray();

  /**
   * fetch data for json array
   *
   * @return list list of child nodes
   */
  public abstract SpinList<SpinJsonNode> elements();

  /**
   * fetch a list of field names for all child nodes of a node
   *
   * @return list list of field names
   */
  public abstract List<String> fieldNames();

}
